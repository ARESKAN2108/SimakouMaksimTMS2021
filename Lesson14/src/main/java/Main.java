import service.TextFormatter;

import java.util.Arrays;
import java.util.List;

import static utils.Constants.*;

public class Main {
    public static void main(String[] args) {
        //1 задание
        List<String> readWordsList = TextFormatter.read(INPUT_PATH_FILE); //читаем файл в список
        List<String> palindromeList = TextFormatter.getPalindrome(readWordsList); // вызываем метод поиска палиндромов
        TextFormatter.write(palindromeList, OUTPUT_PATH_FILE); //пишем полученный лист в файл

        //2 задание
        String value = TextFormatter.readText(INPUT_PATH_FILE_TASK2); //читаем файл
        String replaceString = TextFormatter.getReplaceLine(value); //replace прочитанной строки
        String[] arraySplitSentence = TextFormatter.getSplitString(replaceString); // split строки
        //Пишем подходящие предложения
        for (String element : arraySplitSentence) {
            if (TextFormatter.isSentenceHasPalindrome(element)) {
                TextFormatter.write(element, OUTPUT_PATH_FILE_TASK2);
            } else {
                if (TextFormatter.getCountWords(element) >= 3 && TextFormatter.getCountWords(element) <= 5) {
                    TextFormatter.write(element, OUTPUT_PATH_FILE_TASK2);
                }
            }
        }
    }
}

