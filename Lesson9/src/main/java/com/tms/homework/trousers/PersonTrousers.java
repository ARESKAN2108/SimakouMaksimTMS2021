package com.tms.homework.trousers;

import lombok.ToString;

@ToString
public class PersonTrousers implements ITrousers {
    private String trousers;

    public PersonTrousers() {
    }

    public PersonTrousers(String trousers) {
        this.trousers = trousers;
    }
    @Override
    public void putOn() {
        System.out.println("Штаны одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны сняты");
    }
}
