package ru.application.services.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.application.domain.*;
import ru.application.dto.BookDTO;
import ru.application.repository.*;
import ru.application.services.BookServices;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BookServicesImpl implements BookServices {

    private final BookRepository bookRepository;
    private final ListAuthorBookRepository listAuthorBookRepository;
    private final ListGenreBookRepository listGenreBookRepository;
    private final AuthorRepository authorRepository;
    private final GenreRepository genreRepository;

    @Override
    public List<BookDTO> getAllBook() {

        List<BookDTO> bookDTOList = new ArrayList<>();

        List<Book> bookList = bookRepository.findAll();

        bookList.stream().forEach(book -> {
            BookDTO bookDTO = new BookDTO();
            List<Author> authorList = new ArrayList<>();
            List<Genre> genreList = new ArrayList<>();
            List<ListAuthorBook> listAuthorBooks = listAuthorBookRepository.findAllByIdBook(book.getIdBook());
            List<ListGenreBook> listGenreBooks = listGenreBookRepository.findAllByIdBook(book.getIdBook());

            listAuthorBooks.stream().forEach(listAuthorBook -> {
                authorList.add(authorRepository.findById(listAuthorBook.getId()).get());
            });

            listGenreBooks.stream().forEach(listGenreBook -> {
                genreList.add(genreRepository.findById(listGenreBook.getId()).get());
            });

            bookDTO.setIdBook(book.getIdBook());
            bookDTO.setNameBook(book.getNameBook());
            bookDTO.setDeteRelease(book.getDeteRelease());
            bookDTO.setImage(book.getImage());
            bookDTO.setAuthorInfo(authorList);
            bookDTO.setGenreInfo(genreList);

            bookDTOList.add(bookDTO);
        });

        return bookDTOList;
    }

    @Override
    public BookDTO getBook(Long idBook) {
        Book book = bookRepository.findById(idBook).get();

        BookDTO bookDTO = new BookDTO();

        List<Author> authorList = new ArrayList<>();
        List<Genre> genreList = new ArrayList<>();
        List<ListAuthorBook> listAuthorBooks = listAuthorBookRepository.findAllByIdBook(book.getIdBook());
        List<ListGenreBook> listGenreBooks = listGenreBookRepository.findAllByIdBook(book.getIdBook());

        listAuthorBooks.stream().forEach(listAuthorBook -> {
            authorList.add(authorRepository.findById(listAuthorBook.getId()).get());
        });

        listGenreBooks.stream().forEach(listGenreBook -> {
            genreList.add(genreRepository.findById(listGenreBook.getId()).get());
        });

        bookDTO.setIdBook(book.getIdBook());
        bookDTO.setNameBook(book.getNameBook());
        bookDTO.setDeteRelease(book.getDeteRelease());
        bookDTO.setImage(book.getImage());
        bookDTO.setAuthorInfo(authorList);
        bookDTO.setGenreInfo(genreList);

        return bookDTO;
}

    @Override
    @Transactional
    public boolean addBook(BookDTO bookDTO) {
        try {
            Book book = new Book();

            book.setDeteRelease(bookDTO.getDeteRelease());
            book.setNameBook(bookDTO.getNameBook());
            book.setImage(bookDTO.getImage());

            bookRepository.save(book);

            bookDTO.getAuthorInfo().stream().forEach(author -> {
                ListAuthorBook listAuthorBook = new ListAuthorBook();
                listAuthorBook.setIdAuthor(author.getIdAuthor());
                listAuthorBook.setIdBook(book.getIdBook());
                listAuthorBookRepository.save(listAuthorBook);
            });

            bookDTO.getGenreInfo().stream().forEach(genre -> {
                ListGenreBook listGenreBook = new ListGenreBook();
                listGenreBook.setIdAuthor(genre.getIdGenre());
                listGenreBook.setIdBook(book.getIdBook());
                listGenreBookRepository.save(listGenreBook);
            });

            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    @Transactional
    public boolean editBook(Long id, BookDTO bookDTO) {
        return false;
    }
}
