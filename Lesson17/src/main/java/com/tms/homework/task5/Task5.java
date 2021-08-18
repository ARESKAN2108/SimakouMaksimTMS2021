package com.tms.homework.task5;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Дорницкий", "Владимир", 5),
                new Person("Ворницкий", "Николай", 2),
                new Person("Малащенко", "Сергей", 7),
                new Person("Дердецкий", "Константин", 5),
                new Person("Мерлецкий", "Александр", 9),
                new Person("Петров", "Никита", 10),
                new Person("Довнар", "Алексей", 3));

        Optional<String> result = getSurnameByLetter(people, "Д");
        result.ifPresentOrElse(System.out::println, () -> System.out.println("Не найдено"));

        Map<String, Long> countSurname = getPersonByFirstLetter(people);
        for (Map.Entry<String, Long> entry : countSurname.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static Optional<String> getSurnameByLetter(List<Person> personList, String letter) {
        return Optional.of(personList.stream()
                .filter(Objects::nonNull)
                .map(Person::getSurname)
                .filter(name -> name.startsWith(letter))
                .collect(Collectors.joining(", ")));
    }

    //*
    private static Map<String, Long> getPersonByFirstLetter(List<Person> personList) {
        return personList.stream()
                .map(Person::getSurname)
                .map(name -> name.substring(0, 1))
                .collect(Collectors.groupingBy(let -> let, Collectors.counting()));
    }
}