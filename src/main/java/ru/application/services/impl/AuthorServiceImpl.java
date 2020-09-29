package ru.application.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.application.domain.Author;
import ru.application.repository.AuthorRepository;
import ru.application.services.AuthorService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Author getAuthor(Long id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    @Override
    @Transactional
    public boolean addAuthor(Author author) {
        try {
            authorRepository.save(author);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    @Transactional
    public boolean editAuthor(Long id, Author author) {
        try {
            Author authorM = authorRepository.findById(id).get();
            authorM.setFamilyAuthor(author.getFamilyAuthor());
            authorM.setInformationAuthor(author.getInformationAuthor());
            authorM.setNameAuthor(author.getNameAuthor());
            author.setOtAuthor(author.getOtAuthor());

            authorRepository.save(authorM);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delAuthor(Long id) {
        try {

            authorRepository.delete(authorRepository.findById(id).get());
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
