package com.tms.homework.service;

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


}
