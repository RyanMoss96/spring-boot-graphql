package co.uk.ryanmoss.graphql.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.uk.ryanmoss.graphql.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
    List<Book> findAll();
    List<Book> findAllByAuthor(String author);
}
