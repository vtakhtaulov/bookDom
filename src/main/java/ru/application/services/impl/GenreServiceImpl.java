package ru.application.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.application.domain.Genre;
import ru.application.repository.GenreRepository;
import ru.application.services.GenreService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Override
    public Genre getGenre(Long id) {
        return genreRepository.findById(id).get();
    }

    @Override
    public List<Genre> getAllGenre() {
        return genreRepository.findAll();
    }

    @Override
    @Transactional
    public boolean addGenre(Genre genre) {
        try {

            genreRepository.save(genre);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    @Transactional
    public boolean editGenre(Long id, Genre genre) {
        try {

            Genre genreM = genreRepository.findById(id).get();
            genreM.setNameGenre(genre.getNameGenre());
            genreRepository.save(genreM);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delGenre(Long id) {
        try {

            genreRepository.delete(genreRepository.findById(id).get());
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
