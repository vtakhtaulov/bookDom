package ru.application.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "books", name = "op_author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAuthor;

    private String familyAuthor;
    private String otAuthor;
    private String nameAuthor;
    private String informationAuthor;

}
