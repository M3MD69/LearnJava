package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_2_data_types._2_2_1_1_2_2_enum_types._2_2_1_1_2_2_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.</h2>
 */

enum Shape {
    Circle,
    Triangle,
    Square,
    Rectangle,
    Parallelogram,
    Hexagon
}

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(Shape.Circle);
        System.out.print(Shape.Triangle);
    }
}