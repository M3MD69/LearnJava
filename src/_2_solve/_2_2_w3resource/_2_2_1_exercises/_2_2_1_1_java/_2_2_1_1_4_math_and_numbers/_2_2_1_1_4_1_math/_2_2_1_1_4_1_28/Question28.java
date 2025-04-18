package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_4_math_and_numbers._2_2_1_1_4_1_math._2_2_1_1_4_1_28;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the Excel column name that corresponds to a given column number (integer value).</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the number: 5
 * <br/>
 * Excel Column: E
 * </h2>
 */

public class Question28 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER_OF_COLUMN = 5;
        System.out.printf("""
                        Input the number: %d
                        Excel Column: %s""",
                NUMBER_OF_COLUMN,
                getExcelColumnCharacter(NUMBER_OF_COLUMN));
    }

    private static StringBuilder getExcelColumnCharacter(int numberOfColumn) {
        final StringBuilder EXCEL_COLUMN_CHARACTER = new StringBuilder();
        while (numberOfColumn > 0) {
            EXCEL_COLUMN_CHARACTER.insert(0, (char) ('A' + (numberOfColumn - 1) % 26));
            numberOfColumn = (numberOfColumn - 1) / 26;
        }
        return EXCEL_COLUMN_CHARACTER;
    }
}