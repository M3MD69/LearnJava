package _1_learning._1_6_algorithms._1_6_2_sort._1_6_2_3_insertion;

import java.util.Arrays;

public class InsertionExample {
    public static void main(final String[] ARGS) {
        int[] numbers = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(insertionSorting(numbers));
    }

    private static String insertionSorting(int[] array) {
        for (int index = 0; index < array.length; index++) {
            int key = array[index],
                    index2 = index - 1;
            while (index2 >= 0 && array[index2] > key) {
                array[index2 + 1] = array[index2];
                index2 -= 1;
            }
            array[index2 + 1] = key;
        }
        return Arrays.toString(array);
    }
}