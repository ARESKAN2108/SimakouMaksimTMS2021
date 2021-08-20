package com.tms.homework.task6.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Library {
    List<Book> bookList;
    List<Reader> readerList;

    public List<Book> getBookList() {
        if (bookList == null) {
            bookList = new ArrayList<>();
        }
        return bookList;
    }

    public List<Reader> getReaderList() {
        if (readerList == null) {
            readerList = new ArrayList<>();
        }
        return readerList;
    }
}
