package org.example.tests;

import org.example.BookPagesCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookPagesCountTest {
    @Test
    public void testConstructorThrowsWhenValueIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> new BookPagesCount(-1));
    }
}
