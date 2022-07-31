package co.uk.ryanmoss.graphql.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import co.uk.ryanmoss.graphql.model.Author;
import co.uk.ryanmoss.graphql.model.Book;
import co.uk.ryanmoss.graphql.repository.BookRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {

    private BookRepository repository;

    public List<Book> findAll() {
        return repository.findAll();
    }

    public List<Book> findBooksByAuthor(String author) {
        return repository.findAllByAuthor(author);
    }

    @PostConstruct
    private void init() {
        repository.save(
                Book.builder().title("GraphQL for Dummies").author(Author.builder().name("Ryan M").build()).build());
                repository.save(
                    Book.builder().title("Java 18").author(Author.builder().name("Ryan M").build()).build());
    }
}
