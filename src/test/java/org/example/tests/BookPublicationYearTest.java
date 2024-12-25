package org.example.tests;

import org.example.BookPublicationYear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookPublicationYearTest {
    @Test
    public void testConstructorThrowsWhenValueIsNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new BookPublicationYear(-1));
    }
}
