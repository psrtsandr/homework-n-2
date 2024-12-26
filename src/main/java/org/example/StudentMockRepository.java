package org.example;

import java.util.List;

public class StudentMockRepository {
    private static final List<Student> students = List.of(
            new Student(new FirstName("Randy"), new LastName("Donnelly"),
                    List.of(
                            new Book(new BookTitle("Преступление и наказание"), new BookAuthor("Достоевский Ф.М."), new BookPublicationYear(2014), new BookPagesCount(700)),
                            new Book(new BookTitle("Братья Карамазовы"), new BookAuthor("Достоевский Ф.М."), new BookPublicationYear(2000), new BookPagesCount(1176)),
                            new Book(new BookTitle("Бесы"), new BookAuthor("Достоевский"), new BookPublicationYear(1999), new BookPagesCount(850)),
                            new Book(new BookTitle("Записки из мертвого дома"), new BookAuthor("Достоевский Ф.М."), new BookPublicationYear(1996), new BookPagesCount(621)),
                            new Book(new BookTitle("Игрок"), new BookAuthor("Достоевский Ф.М."), new BookPublicationYear(1990), new BookPagesCount(270)),
                            new Book(new BookTitle("Двойник"), new BookAuthor("Достоевский Ф.М."), new BookPublicationYear(2002), new BookPagesCount(217))
                    )),
            new Student(new FirstName("Keelan"), new LastName("Hess"),
                    List.of(
                            new Book(new BookTitle("Java 8. Полное руководство"), new BookAuthor("Герберт Шилдт"), new BookPublicationYear(2015), new BookPagesCount(1376)),
                            new Book(new BookTitle("Spring в действии"), new BookAuthor("Уоллс К."), new BookPublicationYear(2013), new BookPagesCount(752)),
                            new Book(new BookTitle("Чистый код: создание, анализ и рефакторинг. Библиотека программиста"), new BookAuthor("Роберт Мартин"), new BookPublicationYear(2013), new BookPagesCount(464)),
                            new Book(new BookTitle("Grokking Algorithms"), new BookAuthor("Aditya Y. Bhargava"), new BookPublicationYear(2024), new BookPagesCount(322)),
                            new Book(new BookTitle("Java Concurrency на практике"), new BookAuthor("Гетц Брайан, Пайерлс Тим, Блох Джошуа, Боубер Джозеф, Холмс Дэвид, Ли Даг"), new BookPublicationYear(2020), new BookPagesCount(464)),
                            new Book(new BookTitle("Принципы юнит-тестирования"), new BookAuthor("Хориков Владимир"), new BookPublicationYear(2021), new BookPagesCount(320))
                    )),
            new Student(new FirstName("Kurt"), new LastName("Swanson"),
                    List.of(
                            new Book(new BookTitle("Java Persistence with Spring Data and Hibernate"), new BookAuthor("Catalin Tudose"), new BookPublicationYear(2023), new BookPagesCount(618)),
                            new Book(new BookTitle("SQL Pocket Guide"), new BookAuthor("Alice Zhao"), new BookPublicationYear(2021), new BookPagesCount(358)),
                            new Book(new BookTitle("Современный язык Java. Лямбда-выражения, потоки и функциональное программирование"), new BookAuthor("Рауль-Габриэль Урма, Марио Фуско, Алан Майкрофт"), new BookPublicationYear(2020), new BookPagesCount(592)),
                            new Book(new BookTitle("Паттерны объектно-ориентированного проектирования"), new BookAuthor("Гамма Э., Хелм Р., Джонсон Р., Влиссидес Дж."), new BookPublicationYear(2020), new BookPagesCount(448)),
                            new Book(new BookTitle("Гид Java-разработчика : проектно-ориентированный подход"), new BookAuthor("Урма, Рауль-Габриэль"), new BookPublicationYear(2022), new BookPagesCount(224)),
                            new Book(new BookTitle("Head First. Паттерны проектирования"), new BookAuthor("Фримен Эрик, Робсон Элизабет, Сьерра Кэти, Бейтс Берт"), new BookPublicationYear(2022), new BookPagesCount(640))
                    )),
            new Student(new FirstName("Isabel"), new LastName("Dean"),
                    List.of(
                            new Book(new BookTitle("Чистая архитектура. Искусство разработки программного обеспечения"), new BookAuthor("Роберт Мартин"), new BookPublicationYear(2018), new BookPagesCount(454)),
                            new Book(new BookTitle("Война и мир"), new BookAuthor("Толстой Л.Н."), new BookPublicationYear(1985), new BookPagesCount(1979)),
                            new Book(new BookTitle("Анна Каренина"), new BookAuthor("Толстой Л.Н."), new BookPublicationYear(1984), new BookPagesCount(1081)),
                            new Book(new BookTitle("Воскресение"), new BookAuthor("Толстой Л.Н."), new BookPublicationYear(2001), new BookPagesCount(571)),
                            new Book(new BookTitle("Мертвые души"), new BookAuthor("Гоголь Н.В."), new BookPublicationYear(2004), new BookPagesCount(414)),
                            new Book(new BookTitle("Тарас Бульба"), new BookAuthor("Гоголь Н.В."), new BookPublicationYear(2003), new BookPagesCount(202))
                    )),
            new Student(new FirstName("Nicholas"), new LastName("Larsen"),
                    List.of(
                            new Book(new BookTitle("The Adventures Of Tom Sawyer"), new BookAuthor("Mark Twain"), new BookPublicationYear(2000), new BookPagesCount(321)),
                            new Book(new BookTitle("The Adventures of Huckleberry Finn"), new BookAuthor("Mark Twain"), new BookPublicationYear(1989), new BookPagesCount(392)),
                            new Book(new BookTitle("A Connecticut Yankee in King Arthur's Court"), new BookAuthor("Mark Twain"), new BookPublicationYear(2006), new BookPagesCount(423)),
                            new Book(new BookTitle("The Prince and the Pauper"), new BookAuthor("Mark Twain"), new BookPublicationYear(2009), new BookPagesCount(270)),
                            new Book(new BookTitle("The Stolen White Elephant"), new BookAuthor("Mark Twain"), new BookPublicationYear(1995), new BookPagesCount(20)),
                            new Book(new BookTitle("The Adventures of Sherlock Holmes"), new BookAuthor("Arthur Conan Doyle"), new BookPublicationYear(1997), new BookPagesCount(510))
                    )),
            new Student(new FirstName("Madeline"), new LastName("Stevenson"),
                    List.of(
                            new Book(new BookTitle("The Hound of the Baskervilles"), new BookAuthor("Arthur Conan Doyle"), new BookPublicationYear(2010), new BookPagesCount(162)),
                            new Book(new BookTitle("The Lost World"), new BookAuthor("Arthur Conan Doyle"), new BookPublicationYear(2005), new BookPagesCount(151)),
                            new Book(new BookTitle("Brasilian Cat. Victorian Short Novels"), new BookAuthor("Arthur Conan Doyle"), new BookPublicationYear(1970), new BookPagesCount(289)),
                            new Book(new BookTitle("The Sign Of The Four"), new BookAuthor("Arthur Conan Doyle"), new BookPublicationYear(2004), new BookPagesCount(225)),
                            new Book(new BookTitle("The White Company"), new BookAuthor("Arthur Conan Doyle"), new BookPublicationYear(1994), new BookPagesCount(540)),
                            new Book(new BookTitle("Sample book 6"), new BookAuthor("Sample author 6"), new BookPublicationYear(1999), new BookPagesCount(1000))
                    )),
            new Student(new FirstName("Zaara"), new LastName("Flores"),
                    List.of(
                            new Book(new BookTitle("Преступление и наказание"), new BookAuthor("Достоевский Ф.М."), new BookPublicationYear(2014), new BookPagesCount(700)),
                            new Book(new BookTitle("The Adventures of Sherlock Holmes"), new BookAuthor("Arthur Conan Doyle"), new BookPublicationYear(1997), new BookPagesCount(510)),
                            new Book(new BookTitle("Анна Каренина"), new BookAuthor("Толстой Л.Н."), new BookPublicationYear(1984), new BookPagesCount(1081)),
                            new Book(new BookTitle("Java Persistence with Spring Data and Hibernate"), new BookAuthor("Catalin Tudose"), new BookPublicationYear(2023), new BookPagesCount(618)),
                            new Book(new BookTitle("Grokking Algorithms"), new BookAuthor("Aditya Y. Bhargava"), new BookPublicationYear(2024), new BookPagesCount(322)),
                            new Book(new BookTitle("Java Concurrency на практике"), new BookAuthor("Гетц Брайан, Пайерлс Тим, Блох Джошуа, Боубер Джозеф, Холмс Дэвид, Ли Даг"), new BookPublicationYear(2020), new BookPagesCount(464))
                    )),
            new Student(new FirstName("Damon"), new LastName("Lozano"),
                    List.of(
                            new Book(new BookTitle("Чистая архитектура. Искусство разработки программного обеспечения"), new BookAuthor("Роберт Мартин"), new BookPublicationYear(2018), new BookPagesCount(454)),
                            new Book(new BookTitle("Война и мир"), new BookAuthor("Толстой Л.Н."), new BookPublicationYear(1985), new BookPagesCount(1979)),
                            new Book(new BookTitle("Анна Каренина"), new BookAuthor("Толстой Л.Н."), new BookPublicationYear(1984), new BookPagesCount(1081)),
                            new Book(new BookTitle("Паттерны объектно-ориентированного проектирования"), new BookAuthor("Гамма Э., Хелм Р., Джонсон Р., Влиссидес Дж."), new BookPublicationYear(2020), new BookPagesCount(448)),
                            new Book(new BookTitle("Гид Java-разработчика : проектно-ориентированный подход"), new BookAuthor("Урма, Рауль-Габриэль"), new BookPublicationYear(2022), new BookPagesCount(224)),
                            new Book(new BookTitle("Head First. Паттерны проектирования"), new BookAuthor("Фримен Эрик, Робсон Элизабет, Сьерра Кэти, Бейтс Берт"), new BookPublicationYear(2022), new BookPagesCount(640))
                    )),
            new Student(new FirstName("Sasha"), new LastName("Walters"),
                    List.of(
                            new Book(new BookTitle("Игрок"), new BookAuthor("Достоевский Ф.М."), new BookPublicationYear(1990), new BookPagesCount(270)),
                            new Book(new BookTitle("Двойник"), new BookAuthor("Достоевский Ф.М."), new BookPublicationYear(2002), new BookPagesCount(217)),
                            new Book(new BookTitle("The Prince and the Pauper"), new BookAuthor("Mark Twain"), new BookPublicationYear(2009), new BookPagesCount(270)),
                            new Book(new BookTitle("The Stolen White Elephant"), new BookAuthor("Mark Twain"), new BookPublicationYear(1995), new BookPagesCount(20)),
                            new Book(new BookTitle("Чистый код: создание, анализ и рефакторинг. Библиотека программиста"), new BookAuthor("Роберт Мартин"), new BookPublicationYear(2013), new BookPagesCount(464)),
                            new Book(new BookTitle("Grokking Algorithms"), new BookAuthor("Aditya Y. Bhargava"), new BookPublicationYear(2024), new BookPagesCount(322))
                    )),
            new Student(new FirstName("Alastair"), new LastName("Mcdowell"),
                    List.of(
                            new Book(new BookTitle("The Hound of the Baskervilles"), new BookAuthor("Arthur Conan Doyle"), new BookPublicationYear(2010), new BookPagesCount(162)),
                            new Book(new BookTitle("The Lost World"), new BookAuthor("Arthur Conan Doyle"), new BookPublicationYear(2005), new BookPagesCount(151)),
                            new Book(new BookTitle("Brasilian Cat. Victorian Short Novels"), new BookAuthor("Arthur Conan Doyle"), new BookPublicationYear(1970), new BookPagesCount(289)),
                            new Book(new BookTitle("Братья Карамазовы"), new BookAuthor("Достоевский Ф.М."), new BookPublicationYear(2000), new BookPagesCount(1176)),
                            new Book(new BookTitle("Бесы"), new BookAuthor("Достоевский"), new BookPublicationYear(1999), new BookPagesCount(850)),
                            new Book(new BookTitle("Тарас Бульба"), new BookAuthor("Гоголь Н.В."), new BookPublicationYear(2003), new BookPagesCount(202))
                    ))
    );

    public static List<Student> getStudents() {
        return students;
    }
}
