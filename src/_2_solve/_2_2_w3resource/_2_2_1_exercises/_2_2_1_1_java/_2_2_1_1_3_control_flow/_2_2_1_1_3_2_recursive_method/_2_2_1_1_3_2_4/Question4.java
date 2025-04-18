package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_3_control_flow._2_2_1_1_3_2_recursive_method._2_2_1_1_3_2_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java recursive method to check if a given string is a palindrome.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>madam is a palindrome: true</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        final String WORD = "madam";
        System.out.printf("%s is a palindrome: %b",
                WORD,
                isPalindrome(WORD, 0, WORD.length() - 1));
    }

    private static boolean isPalindrome(final String WORD, int rightIndex, int leftIndex) {
        if (rightIndex == leftIndex || rightIndex > leftIndex)
            return true;
        else if (WORD.charAt(rightIndex) != WORD.charAt(leftIndex))
            return false;
        else
            return isPalindrome(WORD, ++rightIndex, --leftIndex);
    }
}