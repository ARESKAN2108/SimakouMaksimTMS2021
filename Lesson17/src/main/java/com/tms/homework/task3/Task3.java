package com.tms.homework.task3;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = List.of("john", "arya", "sansa");
        names = names.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
