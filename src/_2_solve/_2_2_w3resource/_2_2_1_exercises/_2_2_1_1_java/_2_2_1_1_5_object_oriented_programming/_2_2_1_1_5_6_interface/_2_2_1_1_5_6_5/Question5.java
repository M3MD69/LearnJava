package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_6_interface._2_2_1_1_5_6_5;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final Resizable RECTANGLE = new Rectangle();
        RECTANGLE.resizeWidth(200);
        RECTANGLE.resizeHeight(100);
    }
}

interface Resizable {
    void resizeWidth(final int WIDTH);

    void resizeHeight(final int HEIGHT);
}

class Rectangle implements Resizable {
    @Override
    public void resizeWidth(final int WIDTH) {
        System.out.println("Done resize width to " + WIDTH);
    }

    @Override
    public void resizeHeight(final int HEIGHT) {
        System.out.println("Done resize height to " + HEIGHT);
    }
}