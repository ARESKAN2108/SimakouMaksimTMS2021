package come.home.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

@Getter
@Setter
public class Computer {

    String processor;
    int ram;
    int hdd;
    int resource;

    public Computer(String processor, int ram, int hdd, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public String getInfo() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", resource=" + resource +
                '}';
    }

   public void on() {
        // при повторном включении, когда лимит привышен включений/выключений будем выводить сообщение
       if (resource == 0) {
           System.out.println("Компьютер сгорел, превышен лимит включений/выключений");
       } else {
           Scanner scanner = new Scanner(System.in);
           Random random = new Random();
           int randomValue = random.nextInt(2);

           System.out.println("Внимание! введите 0 или 1: ");
           int userInput = scanner.nextInt();

           if (userInput == randomValue) {
               off();
           } else {
               System.out.println("Компьютер сгорел");
           }
       }
   }

    public void off() {
        // метод офф отнимает ресурс, т.к. совершен полный цикл включений выключений
        // плюс к этому выведем сообщение о выключении(возможно лишнее)
        resource--;
        System.out.println("Компьютер выключился");
    }
}
