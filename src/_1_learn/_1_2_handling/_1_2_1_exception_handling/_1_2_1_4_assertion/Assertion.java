package _1_learn._1_2_handling._1_2_1_exception_handling._1_2_1_4_assertion;

public class Assertion {
    public static void main(final String[] ARGUMENTS) {
        int age = 14;
        assert age <= 18 : "Age must be 18 or older"; // Checking the assumption using assert
        System.out.println("Assertion passed successfully, age is valid");
    }
}