package com.tms.homework.spaceships;

import com.tms.homework.IStart;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean checkSystem() {
        Random random = new Random();
        return random.nextInt(11) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
