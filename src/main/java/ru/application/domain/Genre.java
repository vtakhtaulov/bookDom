package ru.application.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "books", name = "ref_genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idGenre;
    private String nameGenre;

}
