package _1_learning._1_1_basics._1_1_10_keywords._1_1_10_2_break;

public class Break {
    public static void main(final String[] ARGS) {
        int number = 5;
        int index = 0;

        while (true) {
            System.out.println(index);
            ++index;
            if (number == index) {
                System.out.println(number + " Done Stopped");
                break; /* Stops all blocks with break in them! */
            }
        }
    }
}