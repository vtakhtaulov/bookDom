package ru.application.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(schema = "books", name = "op_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idBook;

    private String nameBook;

    @ManyToOne
    @JoinColumn(name = "idAuthor", columnDefinition = "idAuthor")
    private Author idAuthor;

    @ManyToOne
    @JoinColumn(name = "idGenre", columnDefinition = "idGenre")
    private Genre idGenre;

    @DateTimeFormat(pattern = "dd.mm.yyyy")
    private Date deteRelease;

    private String image;

}
