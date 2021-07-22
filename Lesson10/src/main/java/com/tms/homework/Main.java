package com.tms.homework;

import com.tms.homework.spaceships.RosCosmos;
import com.tms.homework.spaceships.Shuttle;
import com.tms.homework.spaceships.SpaceX;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SpacePort spacePort = new SpacePort();
        List<IStart> spaceships = new ArrayList<>();
        spaceships.add(new Shuttle());
        spaceships.add(new SpaceX());
        spaceships.add(new RosCosmos());

        for (IStart spaceship : spaceships) {
            spacePort.getStart(spaceship);
        }
    }
}
