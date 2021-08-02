package com.tms.homework;

import com.tms.homework.service.TextFormatter;
import com.tms.homework.service.TextFormatterImp;

public class Main {
    public static void main(String[] args) {
        TextFormatter textFormatter = new TextFormatterImp();
        String[] words = new String[]{"Дед", "Слово", "Заказ", "Мандарин", "Программа", "Потоп"};

        try {
            System.out.println(textFormatter.getPalindrome(words)); // Слова палиндромы из массива
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(textFormatter.getSubString("Привет.Меня зовут Алексей.Я из города Воронежа."));
        System.out.println(textFormatter.getSomeString()); // замена символов

        // 4 пункт
        String text = "Фильм Довод. Он очень интересный. Советую его посмотреть. Мне понравился. Потоп.";
        String[] arrayText = TextFormatterImp.getArrayText(text);
        for (String arraySentence : arrayText) {
            if (TextFormatterImp.isSentenceHasPalindrome(arraySentence)) {
                System.out.println(arraySentence.trim());
            } else {
                if (TextFormatterImp.getCountWords(arraySentence) >= 3 && TextFormatterImp.getCountWords(arraySentence) <= 5) {
                    System.out.println(arraySentence.trim());
                }
            }
        }
    }
}
