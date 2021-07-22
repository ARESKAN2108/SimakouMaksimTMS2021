package com.tms.homework;

import com.tms.homework.footwear.PersonFootWear;
import com.tms.homework.jacket.PersonJacket;
import com.tms.homework.trousers.PersonTrousers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPerson person1 = new Person("Nikolay", new PersonTrousers("штаны"),new PersonJacket("куртка"),new PersonFootWear("обувь"));
        System.out.println(person1);
        person1.putOnClothes();
        System.out.println();
        person1.takeOffClothes();
    }
}
