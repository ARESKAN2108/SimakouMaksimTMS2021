package com.tms.homework;

import com.tms.homework.service.TextFormatter;
import com.tms.homework.service.TextFormatterImp;

public class Main {
    public static void main(String[] args) {
        TextFormatter textFormatter = new TextFormatterImp();
        String[] words = new String[]{"Дед", "Слово", "Заказ", "Мандарин", "Программа", "Потоп"};

        try {
            textFormatter.getPalindrome(words); // Слова палиндромы из массива
            textFormatter.getSubString("Привет.Меня зовут Алексей.Я из города Воронежа.");
        } catch (StringIndexOutOfBoundsException | NullPointerException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println(textFormatter.getSomeString()); // замена символов
    }
}
