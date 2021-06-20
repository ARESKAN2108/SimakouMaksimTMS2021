import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        System.out.println("Введите числа: ");

        int count = 0;

        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] stringsArrray = numbers.split(" ");


        for (String s : stringsArrray) {
            int x = Integer.parseInt(s);
            if (x > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных чисел " + count);
    }
}
