package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = StudentMockRepository.getStudents();
        students.stream()
                .peek(s -> System.out.printf("%s\nStudent's books:\n%s%n\n",
                        s,
                        s.getBooks().stream()
                                .sorted(Comparator.comparing(Book::publicationYear))
                                .map(String::valueOf)
                                .collect(Collectors.joining("\n"))))
                .flatMap(s -> s.getBooks().stream())
                .sorted(Comparator.comparing(Book::pagesCount))
                .distinct()
                .filter(b -> b.publicationYear().value() > 2000)
                .mapToInt(b -> b.publicationYear().value())
                .limit(3)
                .findFirst()
                .ifPresentOrElse(y -> System.out.printf("Found book publication year: %d\n", y), () -> System.out.println("Book not found"));
    }
}