package com.tms.homework.jacket;

import lombok.ToString;

@ToString
public class PersonJacket implements IJacket {
    private String jacket;

    public PersonJacket() {
    }

    public PersonJacket(String jacket) {
        this.jacket = jacket;
    }

    @Override
    public void putOn() {
        System.out.println("Куртка одета");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка снята");
    }
}
