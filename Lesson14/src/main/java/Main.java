import service.TextFormatter;

import java.util.List;

import static utils.Constants.*;

public class Main {
    public static void main(String[] args) {
        //1 задание
        List<String> readWordsList = TextFormatter.read(INPUT_PATH_FILE); //читаем файл в список
        List<String> palindromeList = TextFormatter.getPalindrome(readWordsList); // вызываем метод поиска палиндромов
        TextFormatter.write(palindromeList, OUTPUT_PATH_FILE); //пишем полученный лист в файл
    }
}

