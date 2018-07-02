package by.itacademy.homework.random;

import java.util.Random;

public class RandomInt {

    public Integer execute() {
        return Math.abs(new Random().nextInt(30));
    }
}