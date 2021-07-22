package com.tms.homework.footwear;

import lombok.ToString;

@ToString
public class PersonFootWear implements IFootwear {
    private String footwear;

    public PersonFootWear() {
    }

    public PersonFootWear(String footwear) {
        this.footwear =footwear;
    }
    @Override
    public void putOn() {
        System.out.println("Обувь одета");
    }

    @Override
    public void takeOff() {
        System.out.println("Обувь снята");
    }
}
