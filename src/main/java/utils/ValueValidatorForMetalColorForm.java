package utils;

import enums.ColorsEnum;

import java.util.ArrayList;
import java.util.List;

public class ValueValidatorForMetalColorForm {

    public static String setOddsDigitValue(int[] oddsValue) {
        if (oddsValue.length == 2) {
            return (oddsValue[0] % 2 != 0) ? String.valueOf(oddsValue[0]) :
                    (oddsValue[1] % 2 != 0) ? String.valueOf(oddsValue[1]) : null;
        } else if (oddsValue.length == 1) {
            return (oddsValue[0] % 2 != 0) ? String.valueOf(oddsValue[0]) : null;
        }
        return null;
    }

    public static String setEvenDigitValue(int[] evenValue) {
        if (evenValue.length == 2) {
            return (evenValue[0] % 2 == 0) ? String.valueOf(evenValue[0]) :
                    (evenValue[1] % 2 == 0) ? String.valueOf(evenValue[1]) : null;
        } else if (evenValue.length == 1) {
            return (evenValue[0] % 2 == 0) ? String.valueOf(evenValue[0]) : null;
        }
        return null;
    }

    public static String[] setEvenElementsValue(String[] elements) {
        List<String> list = new ArrayList<>();
        return (elements.length > 0) ? elements : null;
    }

    public static String setColorValue(String colorValue) {
        if (!colorValue.equals("")) {
            for (ColorsEnum existsColor : ColorsEnum.values()) {
                if (existsColor.text.equalsIgnoreCase(colorValue)) {
                    return colorValue;
                }
            }
        }
        return null;
    }

    public static String setMetalValue(String metal) {
        return (!metal.equals("")) ? metal : null;
    }

    public static String[] setVegetablesValue(String[] vegetables) {
        return (vegetables.length > 0) ? vegetables : null;
    }
}
