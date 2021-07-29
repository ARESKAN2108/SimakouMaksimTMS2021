package com.tms.exception.homework2;

public class Main {
    public static void main(String[] args) {
        //мой метод основан на том чтобы не вводить подтверждения пароля, пока не будет заведен пароль первый раз.
        //иными словами довести пользователя до победы через консоль.
        //чтобы он сам все вводил и подтверждал
        System.out.println(Authorization.checkAuthorization("_Areskan_2108", "AReskan_2205", ""));
        System.out.println();
        System.out.println(Authorization.checkAuthorization("_Areskan_2108__", "AReskan_2205_ares", ""));
        System.out.println();
        System.out.println(Authorization.checkAuthorization("_@Areskan_2108", "AReskan_2205@", ""));
        System.out.println();
        System.out.println(Authorization.checkAuthorization("", "", ""));
    }
}
