package ru.application.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(schema = "books", name = "op_list_author_book")
public class ListAuthorBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_author")
    private Long idAuthor;

    @Column(name = "id_book")
    private Long idBook;
}