package _1_learning._1_4_object_oriented_programming._1_4_5_recursion;

public class Recursion {
    int index = 0;

    public static void main(final String[] ARGS) {
        new Recursion().methodExample();
    }

    void methodExample() {
        System.out.println(index + " Start");
        ++this.index;
        if (index != 5) methodExample();
        else System.out.println(index + " Stop");
    }
}