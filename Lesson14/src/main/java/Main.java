import service.TextFormatter;

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
                TextFormatter.write(element.trim(), OUTPUT_PATH_FILE_TASK2);
            } else {
                if (TextFormatter.getCountWords(element) >= 3 && TextFormatter.getCountWords(element) <= 5) {
                    TextFormatter.write(element.trim(), OUTPUT_PATH_FILE_TASK2);
                }
            }
        }

        //3 задание
        // читаем текст в строку используя метод чтения из второго задания
        String textString = TextFormatter.readText(INPUT_PATH_TEXT_FILE_TASK3);
        String blackList = TextFormatter.readText(INPUT_PATH_BLACK_LIST_TASK3);
        //split прочитанные строки
        String[] arrayText = TextFormatter.getSplitString(textString);
        String[] blackListArray = TextFormatter.getSplitBlackList(blackList);
        // вызываем метод поиска цензуры
        List<String> blackListSentences = TextFormatter.getObsceneSentence(arrayText, blackListArray);
        // выводим на консоль результат
        if (blackListSentences.size() > 0) {
            System.out.println("Количество предложений не прошедших проверку: " + blackListSentences.size());
            for (String sentence : blackListSentences) {
                System.out.println(sentence.trim());
            }
        } else {
            System.out.println("Текст прошел проверку на цензуру");
        }
    }
}

