package com.tms.homework.task6.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Reader {
    private int id;
    private String fullName;
    private EmailAddress emailAddress;//string
    private boolean readerConsent;
    private List<Book> borrowedBooks;

    public Reader(int id, String fullName, EmailAddress emailAddress, boolean readerConsent) {
        this.id = id;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.readerConsent = readerConsent;
        borrowedBooks = new ArrayList<>();
    }
}
