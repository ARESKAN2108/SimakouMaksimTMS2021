package com.tms.homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpacePort {

    public void getStart(IStart iStart) throws InterruptedException {
        if (iStart.checkSystem()) {
            iStart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка у " + iStart.getClass().getSimpleName() + " провалена." );
        }
    }
}


