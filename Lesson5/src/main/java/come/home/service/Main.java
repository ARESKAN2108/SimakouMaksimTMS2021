package come.home.service;

import come.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", 16, 1000, 3);
        System.out.println(computer.getInfo());
        computer.on();

    }
}
