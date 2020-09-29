package ru.application.services;

import ru.application.domain.Book;
import ru.application.dto.BookDTO;

import java.util.List;

public interface BookServices {
    List<BookDTO> getAllBook();
    BookDTO getBook(Long idBook);
    boolean addBook(BookDTO bookDTO);
    boolean editBook(Long id, BookDTO bookDTO);
}
