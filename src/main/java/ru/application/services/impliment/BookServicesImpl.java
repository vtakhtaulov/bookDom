package ru.application.services.impliment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.application.domain.Book;
import ru.application.repository.BookRepository;
import ru.application.services.BookServices;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookServicesImpl implements BookServices {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(Integer idBook) {
        return bookRepository.findById(idBook).get();
    }
}
