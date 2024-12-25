package org.example.tests;

import org.example.BookAuthor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookAuthorTest {
    @Test
    public void testConstructorThrowsWhenValueIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new BookAuthor(null));
    }

    @Test
    public void testConstructorThrowsWhenValueIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new BookAuthor(""));
    }

    @Test
    public void testConstructorThrowsWhenValueIsBlank() {
        assertThrows(IllegalArgumentException.class, () -> new BookAuthor(" "));
    }
}
