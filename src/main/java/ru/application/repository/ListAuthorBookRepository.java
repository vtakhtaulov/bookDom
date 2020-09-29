package ru.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.application.domain.ListAuthorBook;

import java.util.List;

public interface ListAuthorBookRepository extends JpaRepository<ListAuthorBook, Long> {
    List<ListAuthorBook> findAllByIdBook(Long id);
}
