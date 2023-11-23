package groupStageCalculator.util;

import java.io.CharConversionException;
import java.util.InputMismatchException;

public class Validator {

    private final int TEAMS_SIZE = 4;

    public static int validateNumber(int validateNum) {
        int convertedNumber;
        try {
            convertedNumber = validateNum;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            throw new NumberFormatException();
        }
        return convertedNumber;
    }

    public static String validateSentence(String validateSen) {
        String convertedSentence;
        try {
            convertedSentence = validateSen;
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
            throw new InputMismatchException();
        }
        return convertedSentence;
    }

    public static int validateNumber(String validateNum) {
        int convertedNumber;
        try {
            convertedNumber = Integer.parseInt(validateNum);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            throw new NumberFormatException();
        }
        return convertedNumber;
    }




}
