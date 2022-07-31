package co.uk.ryanmoss.graphql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@Entity
@Table(name = "books")
public class Book {

    @Id
    @ToString.Exclude
    @GeneratedValue
    private Long id;

    private String title;

    private String author;
}
