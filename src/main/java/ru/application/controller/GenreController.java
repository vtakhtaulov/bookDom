package ru.application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.application.domain.Genre;
import ru.application.services.GenreService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping(path = "/genre", produces = MediaType.APPLICATION_JSON_VALUE)
public class GenreController {

    private final GenreService genreService;

    @GetMapping(path = "/all")
    public List<Genre> getAllGenre(){
        return genreService.getAllGenre();
    }

    @GetMapping(path = "/{id}")
    public Genre getGenre(@PathVariable Long id){
        return genreService.getGenre(id);
    }

    @PutMapping(path = "/{id}")
    public boolean editGenre(@PathVariable Long id, @RequestBody Genre genre){
        return genreService.editGenre(id, genre);
    }

    @PostMapping(path = "/add")
    public boolean addGenre(@RequestBody Genre genre){
        return genreService.addGenre(genre);
    }

    @DeleteMapping(path = "/del/{id}")
    public boolean delGenre(@PathVariable Long id){
        return genreService.delGenre(id);
    }
}
