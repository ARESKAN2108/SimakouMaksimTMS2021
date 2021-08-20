package com.tms.homework.task6.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Book {
    private int id;
    private String author;
    private String name;
    private int yearOfPublishing;
}
