package org.example.tests;

import org.example.BookPagesCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookPagesCountTest {
    @Test
    public void testConstructorThrowsWhenValueIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> new BookPagesCount(-1));
    }

    @Test
    public void testCompareTo() {
        var a = new BookPagesCount(1);
        var b = new BookPagesCount(2);
        var expected = -1;
        var actual = a.compareTo(b);
        assertEquals(expected, actual);

        a = new BookPagesCount(2);
        b = new BookPagesCount(1);
        expected = 1;
        actual = a.compareTo(b);
        assertEquals(expected, actual);

        a = new BookPagesCount(1);
        b = new BookPagesCount(1);
        expected = 0;
        actual = a.compareTo(b);
        assertEquals(expected, actual);
    }
}
