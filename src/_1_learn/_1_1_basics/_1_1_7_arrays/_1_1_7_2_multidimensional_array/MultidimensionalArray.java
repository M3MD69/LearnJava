package _1_learn._1_1_basics._1_1_7_arrays._1_1_7_2_multidimensional_array;

public class MultidimensionalArray {
    public static void main(final String[] ARGUMENTS) {
        /* You can create endless arrays! */

//        3D Dimensional ArrayExample
        byte[][][] array3D = {
                {
                        {10, 20, 30, 40, 50},
                        {10, 20, 30, 40, 50},
                        {10, 20, 30, 40, 50},
                        {10, 20, 30, 40, 50}
                },
                {
                        {10, 20, 30, 40, 50},
                        {10, 20, 30, 40, 50},
                        {10, 20, 30, 40, 50},
                        {10, 20, 30, 40, 50}
                },
                {
                        {10, 20, 30, 40, 50},
                        {10, 20, 30, 40, 50},
                        {10, 20, 30, 40, 50},
                        {10, 20, 30, 40, 50}
                }
        };

        for (byte[][] array2D : array3D)
            for (byte[] array1D : array2D)
                for (byte item : array1D)
                    System.out.println("3D Dimensional ArrayExample" + item);

//        2D Dimensional ArrayExample
        byte[][] array2D = {
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50}
        };

        for (byte[] array1D : array2D)
            for (byte item : array1D)
                System.out.println("2D Dimensional ArrayExample" + item);
    }
}