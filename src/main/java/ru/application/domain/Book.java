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
    @Column(name = "id_book")
    private Long idBook;

    @Column(name = "name_book")
    private String nameBook;

    @DateTimeFormat(pattern = "dd.mm.yyyy")
    @Column(name = "date_release")
    private Date deteRelease;

    @Column(name = "image")
    private String image;

}
