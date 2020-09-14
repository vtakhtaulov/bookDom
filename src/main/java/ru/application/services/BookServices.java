package ru.application.services;

import ru.application.domain.Book;

import java.util.List;

public interface BookServices {
    List<Book> getAllBook();
    Book getBook(Integer idBook);
}
