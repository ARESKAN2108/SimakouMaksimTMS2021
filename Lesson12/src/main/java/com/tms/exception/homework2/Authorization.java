package com.tms.exception.homework2;

import static com.tms.exception.homework2.Constants.*;

public class Authorization {

    public static boolean checkAuthorization(String login, String password) {
        try {
            if (!login.matches("[\\w]{3,20}+")) {
                throw new WrongLoginException(CORRECT_LOGIN);
            } else {
                System.out.println("Логин принят");
                if (!password.matches("[\\w]{8,20}+")) {
                    throw new WrongPasswordException(CORRECT_PASSWORD);
                } else {
                    System.out.println("Подтвердите пароль, для завершения регистрации:");
                    String passwordConfirm = scanner.nextLine();
                    if (!password.equals(passwordConfirm)) {
                        throw new WrongPasswordException(PASSWORD_MISMATCH);
                    }
                    System.out.println("Аккаунт создан");
                }
            }
        } catch (WrongLoginException exception) {
            System.out.println(exception.getMessage());
            checkAuthorization(scanner.nextLine(), password);
        } catch (WrongPasswordException exception) {
            System.out.println(exception.getMessage());
            checkAuthorization(login, scanner.nextLine());
        }
        return true;
    }
}
