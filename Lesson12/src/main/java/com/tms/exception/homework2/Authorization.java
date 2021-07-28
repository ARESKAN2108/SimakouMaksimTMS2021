package com.tms.exception.homework2;

import java.util.Scanner;

public class Authorization {

    private static final String CORRECT_LOGIN = "Логин должен быть из латинских букв, цифр и знака подчеркивания.\nЛибо вы ввели больше 20 символов\nВведите повторно";
    private static final String CORRECT_PASSWORD = "Пароль должен быть из латинских букв, цифр и знака подчеркивания.\nЛибо вы ввели больше 20 символов\nВведите повторно";
    private static final String PASSWORD_MISMATCH = "Пароли не совпадают. Введите пароль заново: ";

    public static void checkAuthorization(String login, String password, String passwordConfirm) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (!login.matches("_*\\d*?[A-Za-z_]+\\d*_?") && !(login.length() >= 20)) {
                throw new WrongLoginException(CORRECT_LOGIN);
            } else {
                if (!password.matches("_*\\d*?[A-Za-z_]+\\d*_?") && !(password.length() >= 20)) {
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
            String inputLogin = scanner.nextLine();
            checkAuthorization(inputLogin, password, passwordConfirm);
        } catch (WrongPasswordException exception) {
            System.out.println(exception.getMessage());
            String inputPassword = scanner.nextLine();
            checkAuthorization(login, inputPassword, passwordConfirm);
        }
    }
}
