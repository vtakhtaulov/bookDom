package ru.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.application.domain.Book;

public interface BookRepository extends JpaRepository <Book, Long> {
}
