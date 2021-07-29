package com.tms.exception.homework2;

import lombok.experimental.UtilityClass;

import java.util.Scanner;

@UtilityClass
public final class Constants {
    public static final String CORRECT_LOGIN = "Логин может содержать латинские буквы, цифры либо, знак: \"_\".\nНе менее 3-ех символов и не более 20-ти.\nВведите повторно:";
    public static final String CORRECT_PASSWORD = "Пароль может содержать латинские буквы, цифры либо, знак: \"_\".\nНе менее 8-ми символов и не более 20-ти.\nВведите повторно:";
    public static final String PASSWORD_MISMATCH = "Пароли не совпадают. Введите пароль заново:";
    public final static Scanner scanner = new Scanner(System.in);

}
