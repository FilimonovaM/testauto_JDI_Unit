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
}
