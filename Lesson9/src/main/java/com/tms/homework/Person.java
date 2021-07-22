package com.tms.homework;

import com.tms.homework.footwear.IFootwear;
import com.tms.homework.jacket.IJacket;
import com.tms.homework.trousers.ITrousers;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Person implements IPerson {
    private String name;
    private ITrousers trousers;
    private IJacket jacket;
    private IFootwear footwear;

    public Person(String name, ITrousers trousers, IJacket jacket, IFootwear footwear) {
        this.name = name;
        this.trousers = trousers;
        this.jacket = jacket;
        this.footwear = footwear;
    }

    @Override
    public void putOnClothes() {
        trousers.putOn();
        jacket.putOn();
        footwear.putOn();
    }

    @Override
    public void takeOffClothes() {
        trousers.takeOff();
        jacket.takeOff();
        footwear.takeOff();
    }
}
