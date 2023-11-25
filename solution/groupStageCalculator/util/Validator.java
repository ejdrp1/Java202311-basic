package groupStageCalculator.util;

import java.io.CharConversionException;
import java.util.InputMismatchException;
import java.util.Stack;

public class Validator {

    private static final int TEAMS_INFO_SIZE = 7;

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

    //    이거 문제있음 (공백을 입력해도 ArrayIndexOutOfBoundsException 이게 우선으로 튀어나옴)
    public static String validateWordSpacing(String validateSpacingWord) {
        String convertedSpacingWord;
        if (validateSpacingWord.isBlank()) {
            System.out.println("IllegalArgumentException");
            throw new IllegalArgumentException();
        } else {
            convertedSpacingWord = validateSpacingWord;
        }
        return convertedSpacingWord;
    }

    public static String[] validateIndexLength(String[] validateIndexLength) {
        String[] convertedIndexLength;
        for (int i = 0; i < validateIndexLength.length; i++) {
            if (validateIndexLength.length < TEAMS_INFO_SIZE || TEAMS_INFO_SIZE < validateIndexLength.length) {
                System.out.println("ArrayIndexOutOfBoundsException");
                throw new ArrayIndexOutOfBoundsException();
            }
        }
        convertedIndexLength = validateIndexLength;

        return convertedIndexLength;
    }

}
