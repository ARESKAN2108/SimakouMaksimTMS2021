import service.TextFormatter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String INPUT_PATH_FILE = "Lesson14/src/main/java/homework1/input.txt";
    public static final String OUT_PATH_FILE = "Lesson14/src/main/java/homework1/output.txt";
    public static List<String> listOfLines = new ArrayList<>();

    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(INPUT_PATH_FILE));
             FileOutputStream fileOutputStream = new FileOutputStream(OUT_PATH_FILE)) {
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


