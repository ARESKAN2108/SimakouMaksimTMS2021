package com.tms.homework.service;

import java.util.Scanner;

import static com.tms.homework.util.Constants.*;

public class TextFormatterImp implements TextFormatter {

    @Override
    public void getSubString(String str) throws StringIndexOutOfBoundsException {
        if (str == null || str.equals("")) {
            System.out.println("Пустая строка");
        } else {
            if (!(str.contains("А") && str.contains("В"))) {
                throw new StringIndexOutOfBoundsException(CONST);
            } else {
                System.out.println(str.substring(str.indexOf('А'), str.lastIndexOf('В')));
            }
        }
    }

    @Override
    public String getSomeString() {
        System.out.println("Введите строку, которую мы изменим:");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String inputUser = scanner.nextLine();
                if (inputUser.length() >= 3) {
                    return inputUser.replace(inputUser.charAt(3), inputUser.charAt(0));
                } else {
                    return "Нужна строка побольше";
                }
            } else {
                System.out.println("Некорректный ввод");
                scanner.next();
            }
        }
    }
}


