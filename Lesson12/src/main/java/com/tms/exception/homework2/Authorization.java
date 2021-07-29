package com.tms.exception.homework2;

import java.util.Scanner;

public class Authorization {

    private static final String CORRECT_LOGIN = "Логин может содержать латинские буквы, цифры либо, знак: \"_\".\nНе менее 3-ех символов и не более 20-ти.\nВведите повторно:";
    private static final String CORRECT_PASSWORD = "Пароль может содержать латинские буквы, цифры либо, знак: \"_\".\nНе менее 8-ми символов и не более 20-ти.\nВведите повторно:";
    private static final String PASSWORD_MISMATCH = "Пароли не совпадают. Введите пароль заново:";

    public static void checkAuthorization(String login, String password, String passwordConfirm) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (!login.matches("[A-Za-z0-9_]{3,20}+")) {
                throw new WrongLoginException(CORRECT_LOGIN);
            } else {
                if (!password.matches("[A-Za-z0-9_]{8,20}+")) {
                    throw new WrongPasswordException(CORRECT_PASSWORD);
                } else {
                    System.out.println("Подтвердите пароль:");
                    passwordConfirm = scanner.nextLine();
                    if (password.equals(passwordConfirm)) {
                        System.out.println("Вы зарегестрировались");
                    } else {
                        throw new WrongPasswordException(PASSWORD_MISMATCH);
                    }
                }
            }
        } catch (WrongLoginException exception) {
            System.out.println(exception.getMessage());
            login = scanner.nextLine();
            checkAuthorization(login, password, passwordConfirm);
        } catch (WrongPasswordException exception) {
            System.out.println(exception.getMessage());
            password = scanner.nextLine();
            checkAuthorization(login, password, passwordConfirm);
        } finally {
            scanner.close();
        }
    }
}
