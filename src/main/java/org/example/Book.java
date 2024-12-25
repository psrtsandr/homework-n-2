package org.example;

import java.util.Objects;

public record Book(BookTitle title, BookAuthor author, BookPublicationYear publicationYear) {
    @Override
    public String toString() {
        return "Book (Title: %1$s, Author: %2$s, Publication year: %3$s".formatted(title, author, publicationYear);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book(BookTitle otherTitle, BookAuthor otherAuthor, BookPublicationYear otherPublicationYear))) return false;
        return Objects.equals(title(), otherTitle) &&
            Objects.equals(author(), otherAuthor) &&
            Objects.equals(publicationYear(), otherPublicationYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title(), author(), publicationYear());
    }
}

