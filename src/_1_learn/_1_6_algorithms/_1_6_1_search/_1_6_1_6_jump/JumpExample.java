package _1_learn._1_6_algorithms._1_6_1_search._1_6_1_6_jump;

public class JumpExample {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int TARGET = 10;
        System.out.print(jumpSearch(NUMBERS, TARGET));
    }

    private static String jumpSearch(final int[] ARRAY, final int TARGET) {
        final int MAXIMUM_LENGTH = ARRAY.length;
        int blockSize = (int) Math.floor(Math.sqrt(MAXIMUM_LENGTH));
        int preview = 0;

        while (ARRAY[Math.min(blockSize, MAXIMUM_LENGTH) - 1] < TARGET) {
            preview = blockSize;
            blockSize += (int) Math.floor(Math.sqrt(MAXIMUM_LENGTH));
            if (preview >= MAXIMUM_LENGTH)
                return "Element not found";
        }

        for (int index = preview; index < Math.min(blockSize, MAXIMUM_LENGTH); index++)
            if (ARRAY[index] == TARGET)
                return "Element found at index: " + index;

        return "Element not found";
    }
}