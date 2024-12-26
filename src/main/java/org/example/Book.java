package org.example;

import java.util.Objects;

public record Book(BookTitle title, BookAuthor author, BookPublicationYear publicationYear, BookPagesCount pagesCount) {
    public Book {
        if (title == null) {
            throw new IllegalArgumentException("Book title cannot be null");
        }
        if (author == null) {
            throw new IllegalArgumentException("Book author cannot be null");
        }
        if (publicationYear == null) {
            throw new IllegalArgumentException("Book publication year cannot be null");
        }
        if (pagesCount == null) {
            throw new IllegalArgumentException("Book pages count cannot be null");
        }
    }

    @Override
    public String toString() {
        return "Book (Title: %1$s, Author: %2$s, Publication year: %3$s, Pages count: %4$s)"
                .formatted(title, author, publicationYear, pagesCount);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Book(BookTitle otherTitle,
                                  BookAuthor otherAuthor,
                                  BookPublicationYear otherPublicationYear,
                                  BookPagesCount otherPagesCount)) &&
                Objects.equals(title, otherTitle) &&
                Objects.equals(author, otherAuthor) &&
                Objects.equals(publicationYear, otherPublicationYear) &&
                Objects.equals(pagesCount, otherPagesCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear, pagesCount);
    }
}

