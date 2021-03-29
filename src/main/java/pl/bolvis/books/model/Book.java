package pl.bolvis.books.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "books")
public class Book {

    @Id
    private String isbn;
    private String title;
    private long author_id;

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author_id + '\'' +
                '}';
    }
}
