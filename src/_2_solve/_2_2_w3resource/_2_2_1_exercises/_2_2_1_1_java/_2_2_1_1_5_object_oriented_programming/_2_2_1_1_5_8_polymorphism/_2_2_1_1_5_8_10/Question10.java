package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_8_polymorphism._2_2_1_1_5_8_10;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a base class Animal with methods eat() and sound(). Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass to describe what each animal eats. In addition, override the sound() method to make a specific sound for each animal.</h2>
 */
public class Question10 {
    public static void main(final String[] ARGUMENTS) {
        final Animal ANIMAL = new Animal();
        ANIMAL.eat();
        ANIMAL.sound();

        System.out.println();

        final Animal LION = new Lion();
        LION.eat();
        LION.sound();

        System.out.println();

        final Animal TIGER = new Tiger();
        TIGER.eat();
        TIGER.sound();

        System.out.println();

        final Animal PANTHER = new Panther();
        PANTHER.eat();
        PANTHER.sound();
    }
}

class Animal {
    void eat() {
        System.out.println("The animal eats!");
    }

    void sound() {
        System.out.println("The animal make sound!");
    }
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("The lion eats!");
    }

    @Override
    void sound() {
        System.out.println("The lion make sound!");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("The tiger eats!");
    }

    @Override
    void sound() {
        System.out.println("The tiger make sound!");
    }
}

class Panther extends Animal {
    @Override
    void eat() {
        System.out.println("The panther eats!");
    }

    @Override
    void sound() {
        System.out.println("The panther make sound!");
    }
}