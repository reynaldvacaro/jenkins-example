package com.techprimers.testing;

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");

        System.out.println("Hello World");
        return String.valueOf(number);
    }
}
