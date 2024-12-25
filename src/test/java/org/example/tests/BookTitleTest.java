package org.example.tests;

import org.example.BookTitle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTitleTest {
    @Test
    public void testConstructorThrowsWhenValueIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new BookTitle(null));
    }

    @Test
    public void testConstructorThrowsWhenValueIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new BookTitle(""));
    }

    @Test
    public void testConstructorThrowsWhenValueIsBlank() {
        assertThrows(IllegalArgumentException.class, () -> new BookTitle(" "));
    }
}
