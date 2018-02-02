package utils;

public class OperationsWithData {

    static public int stringToInt(String digit) {
        try {
            return Integer.parseInt(digit);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }

    static public String intToString(int digit) {
        return String.valueOf(digit);
    }

    static public int summary(int... digits) {
        int sum = 0;
        for (int i : digits) {
            sum += i;
        }
        return sum;
    }
}
