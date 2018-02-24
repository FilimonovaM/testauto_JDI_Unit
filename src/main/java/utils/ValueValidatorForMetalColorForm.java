package utils;

import enums.ColorsEnum;

// TODO what is this ???
// TODO why did you do this ? To avoid the last data set ?
// TODO I told you that test CAN be failed in this case, cause application works incorrectly !!
public class ValueValidatorForMetalColorForm {

    // TODO a lot of code duplication
    public static String validatedOdds(int[] oddsValue) {
        if (oddsValue.length == 2) {
            return (oddsValue[0] % 2 != 0) ? String.valueOf(oddsValue[0]) :
                    (oddsValue[1] % 2 != 0) ? String.valueOf(oddsValue[1]) : null;
        } else if (oddsValue.length == 1) {
            return (oddsValue[0] % 2 != 0) ? String.valueOf(oddsValue[0]) : null;
        }
        return null;
    }

    public static String validatedEven(int[] evenValue) {
        if (evenValue.length == 2) {
            return (evenValue[0] % 2 == 0) ? String.valueOf(evenValue[0]) :
                    (evenValue[1] % 2 == 0) ? String.valueOf(evenValue[1]) : null;
        } else if (evenValue.length == 1) {
            return (evenValue[0] % 2 == 0) ? String.valueOf(evenValue[0]) : null;
        }
        return null;
    }

    public static String[] validatedElements(String[] elements) {
        return (elements.length > 0) ? elements : null;
    }

    public static String validatedColors(String colorValue) {
        if (!colorValue.equals("")) {
            for (ColorsEnum existsColor : ColorsEnum.values()) {
                if (existsColor.text.equalsIgnoreCase(colorValue)) {
                    return colorValue;
                }
            }
        }
        return null;
    }

    public static String validatedMetal(String metal) {
        return (!metal.equals("")) ? metal : null;
    }

    public static String[] validatedVegetables(String[] vegetables) {
        return (vegetables.length > 0) ? vegetables : null;
    }
}
