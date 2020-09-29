package ru.application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.application.domain.Book;
import ru.application.dto.BookDTO;
import ru.application.services.BookServices;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping(path = "/book", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    private final BookServices bookServices;

    @GetMapping("/all")
    public List<BookDTO> getAllBook(){
        return bookServices.getAllBook();
    }

    @GetMapping("/")
    public BookDTO getAllBook(@RequestParam(name = "idbook") Long idBook){
        return bookServices.getBook(idBook);
    }

    @PostMapping("/addBook")
    public List<Book> addBook(){
        return new ArrayList<>();
    }
}
