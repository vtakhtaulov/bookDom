package ru.application.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import ru.application.domain.Author;
import ru.application.domain.Genre;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class BookDTO {

    private Long idBook;

    private String nameBook;

    private List<Author> authorInfo;

    private List<Genre> genreInfo;

    @DateTimeFormat(pattern = "dd.mm.yyyy")
    private Date deteRelease;

    private String image;
}
