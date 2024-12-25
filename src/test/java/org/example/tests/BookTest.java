package org.example.tests;

import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    private final BookTitle bookTitle = new BookTitle("Sample book title");
    private final BookAuthor bookAuthor = new BookAuthor("Sample book author");
    private final BookPublicationYear bookPublicationYear = new BookPublicationYear(1999);
    private final BookPagesCount bookPagesCount = new BookPagesCount(90);

    @Test
    public void testConstructorThrowsWhenBookTitleIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new Book(null, bookAuthor, bookPublicationYear, bookPagesCount));
    }

    @Test
    public void testConstructorThrowsWhenBookAuthorIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new Book(bookTitle, null, bookPublicationYear, bookPagesCount));
    }

    @Test
    public void testConstructorThrowsWhenBookPublicationYearIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new Book(bookTitle, bookAuthor, null, bookPagesCount));
    }

    @Test
    public void testConstructorThrowsWhenBookPagesCountIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new Book(bookTitle, bookAuthor, bookPublicationYear, null));
    }

    @Test
    public void testToString() {
        var expected = "Book (Title: %1$s, Author: %2$s, Publication year: %3$s, Pages count: %4$s"
                .formatted(bookTitle, bookAuthor, bookPublicationYear, bookPagesCount);
        var actual = new Book(bookTitle, bookAuthor, bookPublicationYear, bookPagesCount).toString();
        assertEquals(expected, actual);
    }
}
