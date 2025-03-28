package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_73_repetitions;

import java.util.Scanner;

public class RepetitionsExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getMaximumRepetition(INPUT.nextLine()));
    }

    private static int getMaximumRepetition(final String TEXT) {
        int maximumRepetition = 1;
        for (int round = 0; round < TEXT.length(); round++) {
            final char CURRENT_CHARACTER = TEXT.charAt(round);
            int currentRepetition = 1;
            for (int index = round + 1; index < TEXT.length(); index++) {
                final char ANOTHER_CHARACTER = TEXT.charAt(index);
                if (CURRENT_CHARACTER == ANOTHER_CHARACTER)
                    currentRepetition++;
                else
                    round = index;
            }
            if (currentRepetition > maximumRepetition)
                maximumRepetition = currentRepetition;
        }
        return maximumRepetition;
    }
}