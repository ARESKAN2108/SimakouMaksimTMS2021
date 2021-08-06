package service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TextFormatter {

    public static List<String> getPalindrome(List<String> strings) {
        List<String> palindromeList = new ArrayList<>();
        for (String element : strings) {
            if (element.matches("\\d+")) {
                continue;
            }
            if (element.equalsIgnoreCase(new StringBuilder(element).reverse().toString())) {
                palindromeList.add(element);
            }
        }
        return palindromeList;
    }

    public static List<String> read(String filePath) {
        List<String> listOfWords = new ArrayList<>();
        try (BufferedReader buffReader = new BufferedReader(new FileReader(filePath))) {
            String line = buffReader.readLine();
            while (line != null) {
                listOfWords.add(line);
                line = buffReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfWords;
    }

    public static void write(List<String> palindromeList, String filePath) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            for (String palindrome : palindromeList) {
                fileOutputStream.write(palindrome.getBytes(StandardCharsets.UTF_8));
                fileOutputStream.write("\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

