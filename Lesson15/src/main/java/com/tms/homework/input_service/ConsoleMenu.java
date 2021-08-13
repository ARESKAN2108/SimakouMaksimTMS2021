package com.tms.homework.input_service;

public class ConsoleMenu {

    public static void showMainMenu() {
        System.out.println("ДОБРО ПОЖАЛОВАТЬ В НАШ МАГАЗИН СТРОИТЕЛЬНЫХ ИНСТРУМЕНТОВ");
        System.out.println();
        System.out.println("Выберите один из пунктов меню:");
        System.out.println("1 - Вывести все товары.");
        System.out.println("2 - Добавление товара.");
        System.out.println("3 - Удалить товар.");
        System.out.println("4 - Редактирование товара.");
        System.out.println("5 - Выход.");
    }

    public static void showMenuOfAllProducts() {
        System.out.println("Вывести товары в зависимости от следующих сортировок:");
        System.out.println("1 - по цене(возрастание)");
        System.out.println("2 - по цене(убывание)");
        System.out.println("3 - по добавлению(сначала новые, потом старые)");
        System.out.println("4 - Вернуться в главное меню.");
    }

    public static void showAddProductMenu() {
        System.out.println("1 - Введите параметры нового товара: Id, наименование, цена.");
        System.out.println("2 - Вернуться в главное меню.");
    }

    public static void showRemoveProductMenu() {
        System.out.println("1 - Введите id товара, который будет удален.");
        System.out.println("2 - Вернуться в главное меню.");
    }

    public static void showEditingProductMenu() {
        System.out.println("1 - Введите id товара, в котором мы произведем редактирование.");
        System.out.println("2 - Вернуться в главное меню.");
    }

    public static void continueMenu() {
        System.out.println();
        System.out.println("Для продолжения выберите один из следующих пунктов:");
        System.out.println("1 - Выйти в главное меню.");
        System.out.println("2 - Выход из магазина.");
    }
}
