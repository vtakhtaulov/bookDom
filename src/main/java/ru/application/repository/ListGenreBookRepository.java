package ru.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.application.domain.ListGenreBook;

import java.util.List;

public interface ListGenreBookRepository extends JpaRepository<ListGenreBook, Long> {
    List<ListGenreBook> findAllByIdBook(Long id);
}
