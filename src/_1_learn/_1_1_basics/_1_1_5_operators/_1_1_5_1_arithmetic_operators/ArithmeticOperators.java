package _1_learn._1_1_basics._1_1_5_operators._1_1_5_1_arithmetic_operators;

public class ArithmeticOperators {
    public static void main(final String[] ARGUMENTS) {
        /* √
         * Prefix = Pre
         * Postfix = Post */

        /* Arithmetic Operators Types! */
        /* ( + ) Addition
         * ( - ) Subtraction
         * ( * ) Multiplication
         * ( / ) Division
         * ( % ) Modulus
         * ( ++ ) Increment
         * ( -- ) Decrement
         * */

        int number1 = 10;
        int number2 = 3;

        System.out.println("Addition = " + (number1 + number2)); //  Addition
        System.out.println("Subtraction = " + (number1 - number2)); //  Subtraction
        System.out.println("Multiplication = " + (number1 * number2)); //  Multiplication
        System.out.println("Division = " + ((float) number1 / number2)); //  Division
        System.out.println("Modulus = " + (number1 % number2)); //  Modulus

//        Increment
        System.out.println("Prefix Increment = " + ++number1); // Prefix Increment
        System.out.println("Postfix Increment = " + number1++); // Postfix Increment

//        Decrement
        System.out.println("Prefix Decrement = " + --number2); // Prefix Decrement
        System.out.println("Postfix Decrement = " + number2--); // Postfix Decrement

        /* The (postfix increment or postfix decrement) is applied after calling the variable! */
        /* ↓ Example
        int number = 5;
        number++; // not yet applied
        System.out.println("Example post increment = " + number); // done applied
        */
    }
}