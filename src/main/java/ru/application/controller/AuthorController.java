package ru.application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.application.domain.Author;
import ru.application.services.AuthorService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping(path = "/author", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping(path = "/all")
    public List<Author> getAllAuthor(){
        return authorService.getAllAuthor();
    }

    @GetMapping(path = "/{id}")
    public Author getAuthor(@PathVariable Long id){
        return authorService.getAuthor(id);
    }

    @PutMapping(path = "/{id}")
    public boolean editAuthor(@PathVariable Long id, @RequestBody Author author){
        return authorService.editAuthor(id, author);
    }

    @PostMapping(path = "/add")
    public boolean addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @DeleteMapping(path = "/del/{id}")
    public boolean delAuthor(@PathVariable Long id){
        return authorService.delAuthor(id);
    }
}
