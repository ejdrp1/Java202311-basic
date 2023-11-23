package groupStageCalculator.util;

public class Validator {

    public static int validateNumber(String validateNum) {
        int convertedNumber;
        try {
            convertedNumber = Integer.parseInt(validateNum);
        } catch (NumberFormatException e) {
            System.out.println("error!");
            throw new NumberFormatException();
        }
        return convertedNumber;
    }

}
