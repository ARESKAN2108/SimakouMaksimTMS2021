package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.Constants.*;

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

    public static void readAndWrite(String path) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(path));
             FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_PATH_FILE)) {
            List<String> listOfLines = new ArrayList<>();
            String line = fileReader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = fileReader.readLine();
            }
            List<String> palindromeList = TextFormatter.getPalindrome(listOfLines);
            for (String palindrome : palindromeList) {
                fileOutputStream.write(palindrome.getBytes());
                fileOutputStream.write("\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

