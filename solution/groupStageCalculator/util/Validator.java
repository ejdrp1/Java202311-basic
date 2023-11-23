package groupStageCalculator.util;

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

    public static String[] validateArrayIndex(String validateArrayIndex) {
        String[] arr;
        try {
            arr = new String[validateArrayIndex.length()];
            for (int i = 0; i <= validateArrayIndex.length(); i++) {
                arr[i] = String.valueOf(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr;
    }


}
