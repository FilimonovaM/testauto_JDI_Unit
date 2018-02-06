package utils;

import enums.ColorsEnum;
import enums.ElementsEnum;
import enums.VegetablesEnum;

import java.util.ArrayList;
import java.util.List;

import static enums.ElementsEnum.WATER;
import static utils.OperationsWithData.stringToInt;

public class ValueValidatorForMetalColorForm {
    private static final String DEFAULT_ODDS = "1";
    private static final String DEFAULT_EVEN = "2";
    private static final String DEFAULT_COLOR = "Colors";
    private static final String DEFAULT_METAL = "Col";

    public static String setOddsDigitValue(String oddsValue) {
        if (oddsValue.length() == 2) {
            return (stringToInt(oddsValue.substring(0, 1)) % 2 != 0) ? oddsValue.substring(0, 1) :
                    (stringToInt(oddsValue.substring(1, 2)) % 2 != 0) ? oddsValue.substring(1, 2) : DEFAULT_ODDS;
        } else if (oddsValue.length() == 1) {
            return (stringToInt(oddsValue.substring(0, 1)) % 2 != 0) ? oddsValue : DEFAULT_ODDS;
        }
        return DEFAULT_ODDS;
    }

    public static String setEvenDigitValue(String evenValue) {
        if (evenValue.length() == 2) {
            return (stringToInt(evenValue.substring(0, 1)) % 2 == 0) ? evenValue.substring(0, 1) :
                    (stringToInt(evenValue.substring(1, 2)) % 2 == 0) ? evenValue.substring(1, 2) : DEFAULT_EVEN;
        } else if (evenValue.length() == 1) {
            return (stringToInt(evenValue.substring(0, 1)) % 2 == 0) ? evenValue : DEFAULT_EVEN;
        }
        return DEFAULT_EVEN;
    }

    public static String[] setEvenElementsValue(String elements) {
        List<String> list = new ArrayList<>();
        if (elements.length() > 0) {
            for (ElementsEnum existsElement : ElementsEnum.values()) {
                if (elements.contains(existsElement.text)) {
                    list.add(existsElement.text);
                }
            }
        }
        return (list.size() > 0) ? list.toArray(new String[list.size()]) : new String[]{WATER.text, WATER.text};
    }

    public static String setColorValue(String colorValue) {
        if (!colorValue.equals("")) {
            for (ColorsEnum existsColor : ColorsEnum.values()) {
                if (existsColor.text.equalsIgnoreCase(colorValue)) {
                    return colorValue;
                }
            }
        }
        return DEFAULT_COLOR;
    }

    public static String setMetalValue(String metal) {
        return (!metal.equals("")) ? metal : DEFAULT_METAL;
    }

    public static String[] setVegetablesValue(String vegetables) {
        if (vegetables.length() > 0) {
            List<String> list = new ArrayList<>();
            for (VegetablesEnum existsVegetable : VegetablesEnum.values()) {
                if (vegetables.contains(existsVegetable.text)) {
                    list.add(existsVegetable.text);
                }
            }
            return (list.size() > 0) ? list.toArray(new String[list.size()]) : null;
        }
        return null;
    }
}
