package ru.application.services;

import ru.application.domain.Author;

import java.util.List;

public interface AuthorService {
    Author getAuthor(Long id);
    List<Author> getAllAuthor();
    boolean addAuthor(Author author);
    boolean editAuthor(Long id, Author author);
    boolean delAuthor(Long id);
}
