package utils;

// TODO oh my goodness, what is the reason you need this methods ?
public class OperationsWithData {

    // TODO what happened in case if stringToInt("0") or stringToInt("abc") ? The results will be the same...
    static public int stringToInt(String digit) {
        try {
            return Integer.parseInt(digit);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }

    // TODO Integer.toString(int)
    static public String intToString(int digit) {
        return String.valueOf(digit);
    }

    // TODO IntStream.of(int[]).sum();
    // TODO list.stream().mapToInt(Integer::intValue).sum();
    static public int summary(int... digits) {
        int sum = 0;
        for (int i : digits) {
            sum += i;
        }
        return sum;
    }
}
