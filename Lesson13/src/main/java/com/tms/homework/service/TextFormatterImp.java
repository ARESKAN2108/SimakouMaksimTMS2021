package com.tms.homework.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.tms.homework.util.Constants.*;

public class TextFormatterImp implements TextFormatter {

    @Override
    public String getSubString(String str) {
        if (str == null || str.equals("")) {
            return null;
        } else {
            int indexA = str.indexOf('А');
            int indexB = str.indexOf('В');
            if (indexA >= 0 && indexB >= 0) {
                return str.substring(str.indexOf('А'), str.lastIndexOf('В'));
            } else {
                return SUBSTRING_VALIDATION_MESSAGE;
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
                    return inputUser.replace(inputUser.charAt(2), inputUser.charAt(0));
                } else {
                    return NEED_A_BIGGER_STRING;
                }
            } else {
                System.out.println("Некорректный ввод");
                scanner.next();
            }
        }
    }

    @Override
    public List<String> getPalindrome(String[] strings) throws NullPointerException {
        List<String> palindromeList = new ArrayList<>();
        for (String string : strings) {
            if (string == null) {
                throw new NullPointerException(FILL_THE_ARRAY);
            }
            if (string.length() >= 2) {
                if (string.equalsIgnoreCase(new StringBuilder(string).reverse().toString())) {
                    palindromeList.add(string);
                }
            }
        }
        return palindromeList;
    }
}





