package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void hello() {
                System.out.println("Hello world");
            }
        };
        greeting.hello();
        Greeting greeting1 = () -> System.out.println("Hello world1");
        greeting1.hello();


        Calculator calculator = (x, y) -> {
            Random random = new Random();
            int ramdomNumber = random.nextInt(50);
            return x * y + ramdomNumber;

        };
        System.out.println(calculator.calculate(3, 4));
  }
}