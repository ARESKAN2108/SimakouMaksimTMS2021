package com.tms.teachmeskills;

import com.tms.teachmeskills.hands.SamsungHand;
import com.tms.teachmeskills.hands.SonyHand;
import com.tms.teachmeskills.heads.SamsungHead;
import com.tms.teachmeskills.heads.SonyHead;
import com.tms.teachmeskills.heads.ToshibaHead;
import com.tms.teachmeskills.legs.SonyLeg;
import com.tms.teachmeskills.legs.ToshibaLeg;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<IRobot> robots = new ArrayList<>();
        robots.add(new Robot(new SonyHead(234), new SonyHand(438), new ToshibaLeg(534)));
        robots.add(new Robot(new ToshibaHead(520), new SamsungHand(335), new SonyLeg(250)));
        robots.add(new Robot(new SamsungHead(100), new SamsungHand(1000), new SonyLeg(250)));

        int maxPrice = 0;
        int indexRobot = 0;
        for (IRobot robot : robots) {
            System.out.println("Робот № " + (robots.indexOf(robot) + 1) + " демонстирует свои возможности");
            robot.action();
            System.out.println();
            if (robot.getPrice() > maxPrice) {
                maxPrice = robot.getPrice();
                indexRobot = robots.indexOf(robot) + 1;
            }
        }
        System.out.println("Самый дорогой робот стоит: " + maxPrice + " долларов. ");
        System.out.println("Его номер в спике: " + indexRobot);
    }
}

 /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
