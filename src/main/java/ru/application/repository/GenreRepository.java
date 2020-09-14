package ru.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.application.domain.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
