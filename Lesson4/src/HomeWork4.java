public class HomeWork4 {
    public static void main(String[] args) {
        amoeba();
        System.out.println("Результат вычисления умножения = " + summ(5, 6));
    }

    // 1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    // сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    private static void amoeba() {

        int countAmoeba = 1;

        for (int i = 3; i < 25; i += 3) {
            countAmoeba *= 2;
            int stringHours = i % 10;
            if (stringHours == 1) {
                System.out.println("Через " + i + " час амеб будет " + countAmoeba);
            } else if (stringHours > 2 && stringHours <= 4) {
                System.out.println("Через " + i + " часа амеб будет " + countAmoeba);
            } else {
                System.out.println("Через " + i + " часов амеб будет " + countAmoeba);
            }
        }
        System.out.println("За сутки будет 256 амеб");
    }

    //2) Напишите реализацию метода summ(int a, int b), вычисляющий a * b, не пользуясь операцией
    //умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

    private static int summ(int a, int b) {
        return Math.multiplyExact(a, b);
    }
}