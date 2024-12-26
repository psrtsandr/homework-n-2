package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = StudentMockRepository.getStudents();
        students.stream()
                .peek(s -> System.out.printf("Peek %s\nPeek Student's books:\n%s%n\n",
                        s,
                        s.getBooks().stream()
                                .sorted(Comparator.comparing(Book::publicationYear))
                                .map(String::valueOf)
                                .collect(Collectors.joining("\n"))))
                .flatMap(s -> s.getBooks().stream())
                .sorted(Comparator.comparing(Book::pagesCount))
                .distinct()
                .filter(b -> b.publicationYear().value() > 2000)
                .limit(3)
                .peek(b -> System.out.printf("Peek book publication year: %s\n", b.publicationYear()))
                .findFirst()
                .ifPresentOrElse(b -> System.out.printf("Found book publication year: %s\n", b.publicationYear()), () -> System.out.println("Book not found"));
    }
}