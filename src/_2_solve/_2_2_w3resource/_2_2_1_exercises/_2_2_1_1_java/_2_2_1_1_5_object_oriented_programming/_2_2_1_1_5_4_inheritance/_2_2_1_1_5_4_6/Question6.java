package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_4_inheritance._2_2_1_1_5_4_6;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.</h2>
 */

public class Question6 {
    public static void main(final String[] ARGUMENTS) {
        final Cheetah CHEETAH = new Cheetah();
        CHEETAH.move();
    }
}

class Animal {
    void move() {
        System.out.println("Animal Move!");
    }
}

class Cheetah extends Animal {
    @Override
    void move() {
        System.out.println("Cheetah Running!");
    }
}