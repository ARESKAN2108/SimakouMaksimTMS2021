package com.tms.homework.spaceships;

import com.tms.homework.IStart;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;
@Getter
@Setter
public class Shuttle implements IStart {

    @Override
    public boolean checkSystem() {
        Random random = new Random();
        return random.nextInt(11) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
