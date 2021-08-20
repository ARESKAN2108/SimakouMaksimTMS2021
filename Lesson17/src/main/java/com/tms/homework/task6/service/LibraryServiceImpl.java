package com.tms.homework.task6.service;

import com.tms.homework.task6.model.Book;
import com.tms.homework.task6.model.Library;
import com.tms.homework.task6.model.Reader;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class LibraryServiceImpl implements LibraryService {
    private final Library library;

    public LibraryServiceImpl(Library library) {
        this.library = library;
    }

    @Override
    public List<Book> getAllSortedBooksByYear() {
        return getAllBooks().stream()
                .sorted(Comparator.comparingInt(Book::getYearOfPublishing))
                .collect(Collectors.toList());
    }

    @Override
    public void addBook(Book book) {
        getAllBooks().add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return library.getBookList();
    }

    @Override
    public void addReader(Reader reader) {
        getAllReader().add(reader);
    }

    @Override
    public List<Reader> getAllReader() {
        return library.getReaderList();
    }

    @Override
    public List<Book> findAllBooksByReader(Reader reader) {
        return reader.getBorrowedBooks();
    }

    @Override
    public List<Reader> findAllReadersAgree() {
        return getAllReader().stream()
                .filter(Reader::isReaderConsent)
                .collect(Collectors.toList());
    }

    @Override
    public Book findBookById(int id) {
        return getAllBooks().stream()
                .filter(book -> book.getId() == id)
                .findAny().orElse(null);
    }

    @Override
    public Reader findReaderById(int id) {
        return getAllReader().stream()
                .filter(reader -> reader.getId() == id)
                .findAny().orElse(null);
    }

    @Override
    public void addBookToReader(int readerInt, int bookId) {
        try {
            Book book = findBookById(bookId);
            List<Book> readersBooks = getBooksFromReader(readerInt);
            readersBooks.add(book);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void receiveBookToLibrary(int bookId, int readerId) {
        try {
            Book book = findBookById(bookId);
            List<Book> readerBooks = getBooksFromReader(readerId);
            readerBooks.remove(book);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    private List<Book> getBooksFromReader(int readerId) {
        List<Book> readerBooks = null;
        try {
            Reader reader = findReaderById(readerId);
            readerBooks = findAllBooksByReader(reader);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        return readerBooks;
    }

}
