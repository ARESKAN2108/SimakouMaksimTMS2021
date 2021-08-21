package com.tms.homework.task6;

import com.tms.homework.task6.model.Book;
import com.tms.homework.task6.model.EmailAddress;
import com.tms.homework.task6.model.Library;
import com.tms.homework.task6.model.Reader;
import com.tms.homework.task6.service.LibraryService;
import com.tms.homework.task6.service.LibraryServiceImpl;
import com.tms.homework.task6.service.MessageService;
import com.tms.homework.task6.service.MessageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryService libraryService = new LibraryServiceImpl(library);
        MessageService messageService = new MessageServiceImpl();

        List<Book> booksList = List.of(
                new Book(1, "Михаил Булгаков", "Собачье сердце", 1925),
                new Book(2, "Александр Пушкин", "Евгений Онегин", 1837),
                new Book(3, "Иван Тургенев", "Отцы и дети", 1861),
                new Book(4, "Лев Толстой", "Война и мир", 1868),
                new Book(5, "Николай Гоголь", "Ревизор", 1836)
        );

        List<Reader> readers = List.of(
                new Reader(1, "Петров Петр Петрович", new EmailAddress("petrov@mail.ru"), true),
                new Reader(2, "Иванов Иван Иванович", new EmailAddress("ivanov@mail.ru"), false),
                new Reader(3, "Олегов Олег Олегович", new EmailAddress("olegov@mail.ru"), true),
                new Reader(4, "Андреев Андрей Андреевич", new EmailAddress("andreev@mail.ru"), false)
        );

        Map<Integer, List<Integer>> readerBookList = Map.of(
                1, List.of(1, 2, 3, 4),
                2, List.of(2, 3, 5),
                3, List.of(4, 2, 5),
                4, List.of(5)
        );

        booksList.forEach(libraryService::addBook);
        readers.forEach(libraryService::addReader);

        var key = readerBookList.keySet();
        key.forEach(k -> readerBookList.get(k).forEach(value -> libraryService.addBookToReader(k, value))); // не работает

        libraryService.getAllSortedBooksByYear().forEach(System.out::println);

        messageService.sendMessage("Библиотека закрывается", readers).forEach(System.out::println);

        messageService.sendMessage("Для согласных", libraryService.findAllReadersAgree())
                .forEach(System.out::println);


    }
}
