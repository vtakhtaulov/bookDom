package ru.application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.application.domain.Book;
import ru.application.services.BookServices;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/book", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    private final BookServices bookServices;

    @GetMapping("/all")
    public List<Book> getAllBook(){
        return bookServices.getAllBook();
    }

    @GetMapping("/")
    public Book getAllBook(@RequestParam(name = "idbook") Integer idBook){
        return bookServices.getBook(idBook);
    }

    @PostMapping
    public List<Book> addBook(){
        return new ArrayList<>();
    }
}
