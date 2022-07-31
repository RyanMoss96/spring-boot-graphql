package co.uk.ryanmoss.graphql.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import co.uk.ryanmoss.graphql.model.Book;
import co.uk.ryanmoss.graphql.service.BookService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BookController {

    private BookService bookService;

    @SchemaMapping(typeName = "Query",value = "allBooks")
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
