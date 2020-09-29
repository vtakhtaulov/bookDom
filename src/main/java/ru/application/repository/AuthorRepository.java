package ru.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.application.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
