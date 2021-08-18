package com.tms.homework.task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> nums = random.ints(20, 1, 20)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(nums);

        List<Integer> multiplyNums = nums.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(multiplyNums);
    }
}
