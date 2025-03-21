package _1_learn._1_3_object_oriented_programming._1_3_10_polymorphism;

/* Method overloading is also an example of polymorphism! */
/* The print() method is also an example of polymorphism, Because used to print values of different types like char, int, string, etc! */

// Polymorphism
class Shape {
    public void render() {
        System.out.println("Shape");
    }
}

class Square extends Shape {
    public void render() {
        System.out.println("Square");
    }
}

class Circle extends Shape {
    public void render() {
        System.out.println("Circle");
    }
}

public class Polymorphism {
    public static void main(final String[] ARGUMENTS) {
//        Polymorphism
        Shape shape = new Shape();
        shape.render();
        Shape square = new Square();
        square.render();
        Shape circle = new Circle();
        circle.render();

//        Polymorphism with Overloading Method
        new Polymorphism().method('a');
        new Polymorphism().method("Aa");
    }

    void method(char charVariable) {
        System.out.println(charVariable);
    }

    void method(String stringVariable) {
        System.out.println(stringVariable);
    }
}