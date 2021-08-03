package service;

import java.util.ArrayList;
import java.util.List;

public class TextFormatter {

    public static List<String> getPalindrome(List<String> strings) {
        List<String> palindromeList = new ArrayList<>();
        for (String element : strings) {
            if (element.matches("[0-9]+")) {
                continue;
            }
            if (element.equalsIgnoreCase(new StringBuilder(element).reverse().toString())) {
                palindromeList.add(element);
            }
        }
        return palindromeList;
    }
}
