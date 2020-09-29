package ru.application.services;

import ru.application.domain.Genre;

import java.util.List;

public interface GenreService {
    Genre getGenre(Long id);
    List<Genre> getAllGenre();
    boolean addGenre(Genre genre);
    boolean editGenre(Long id, Genre genre);
    boolean delGenre(Long id);
}
