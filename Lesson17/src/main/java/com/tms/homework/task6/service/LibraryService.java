package com.tms.homework.task6.service;

import com.tms.homework.task6.model.Book;
import com.tms.homework.task6.model.EmailAddress;
import com.tms.homework.task6.model.Reader;

import java.util.List;
import java.util.Map;

public interface LibraryService {

    List<Book> getAllSortedBooksByYear();

    void addBook(Book book);

    List<Book> getAllBooks();

    void addReader(Reader reader);

    List<Reader> getAllReader();

    List<Book> findAllBooksByReader(Reader reader);

    List<Reader> findAllReadersAgree();

    Book findBookById(int id);

    Reader findReaderById(int id);

    void addBookToReader(int readerInt, int bookId);

    void receiveBookToLibrary(int bookId, int readerId);

    List<Book> getBooksOfReaders();

    Map<Boolean, List<Reader>> checkBookByAuthor();

    Integer getMaxBooks();

    Map<String, List<EmailAddress>> sendMessageByGroup();

    Map<String, List<Reader>> getReadersMap();

    Map<String, String> getReaderFullNameMap();

}
