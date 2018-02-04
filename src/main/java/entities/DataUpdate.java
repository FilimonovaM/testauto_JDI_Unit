package entities;

import enums.ColorsEnum;
import enums.ElementsEnum;
import enums.VegetablesEnum;
import utils.OperationsWithData;

import java.util.ArrayList;
import java.util.List;

import static enums.ColorsEnum.RED;
import static enums.ElementsEnum.FIRE;
import static enums.ElementsEnum.WATER;
import static enums.EvenDigitsEnum.EIGHT;
import static enums.EvenDigitsEnum.TWO;
import static enums.MetalsEnum.SELEN;
import static enums.OddsDigitsEnum.ONE;
import static enums.OddsDigitsEnum.THREE;
import static enums.VegetablesEnum.CUCUMBER;
import static enums.VegetablesEnum.SALAD;
import static enums.VegetablesEnum.TOMATO;

public class DataUpdate {

    public static String oddsRadioButton;
    public static String evenRadioButton;
    public static String colorDropdown;
    public static String metalDropdown;
    public static String[] elements;
    public static String[] vegetables;

    public static final DataUpdate DEFAULT = new DataUpdate(new String[]{
            THREE.text + EIGHT.text,
            WATER.text + FIRE.text,
            RED.text,
            SELEN.text,
            CUCUMBER.text + TOMATO.text});

    public DataUpdate() {
    }

    public DataUpdate(String[] newData) {

        if (newData[0].length() == 2) {
            oddsRadioButton = newData[0].substring(0, 1);
            evenRadioButton = newData[0].substring(1, 2);
        } else if (newData[0].length() == 1) {
            oddsRadioButton = ((OperationsWithData.stringToInt(newData[0]) % 2) == 0) ? ONE.text : newData[0];
            evenRadioButton = ((OperationsWithData.stringToInt(newData[0]) % 2) != 0) ? TWO.text : newData[0];
        } else {
            oddsRadioButton = ONE.text;
            evenRadioButton = TWO.text;
        }

        List<String> list = new ArrayList<>();
        if (newData[1].length() > 0) {
            for (ElementsEnum existsElement : ElementsEnum.values()) {
                if (newData[1].contains(existsElement.text)) {
                    list.add(existsElement.text);
                }
            }
            elements = new String[list.size()];
            list.toArray(elements);
        } else {
            elements = new String[]{WATER.text, WATER.text};
        }

        colorDropdown = "Colors";
        if (newData[2].length() > 0) {
            for (ColorsEnum existsColor : ColorsEnum.values()) {
                if (existsColor.text.equalsIgnoreCase(newData[2])) {
                    colorDropdown = newData[2];
                    break;
                }
            }
        }

        metalDropdown = (!newData[3].equals("")) ? newData[3] : "Col";

        if (newData[4].length() > 0) {
            list = new ArrayList<>();
            for (VegetablesEnum existsVegetable : VegetablesEnum.values()) {
                if (newData[4].contains(existsVegetable.text)) {
                    list.add(existsVegetable.text);
                }
            }
            vegetables = new String[list.size()];
            list.toArray(vegetables);
        } else {
            vegetables = new String[]{SALAD.text};
        }
    }
}
