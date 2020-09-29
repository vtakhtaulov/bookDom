package ru.application.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(schema = "books", name = "op_list_genre_book")
public class ListGenreBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_genre")
    private Long idAuthor;

    @Column(name = "id_book")
    private Long idBook;
}
