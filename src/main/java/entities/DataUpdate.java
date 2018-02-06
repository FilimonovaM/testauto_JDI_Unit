package entities;

import static enums.ColorsEnum.RED;
import static enums.ElementsEnum.FIRE;
import static enums.ElementsEnum.WATER;
import static enums.EvenDigitsEnum.EIGHT;
import static enums.MetalsEnum.SELEN;
import static enums.OddsDigitsEnum.THREE;
import static enums.VegetablesEnum.CUCUMBER;
import static enums.VegetablesEnum.TOMATO;
import static utils.ValueValidatorForMetalColorForm.*;

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
        oddsRadioButton = setOddsDigitValue(newData[0]);
        evenRadioButton = setEvenDigitValue(newData[0]);
        elements = setEvenElementsValue(newData[1]);
        colorDropdown = setColorValue(newData[2]);
        metalDropdown = setMetalValue(newData[3]);
        vegetables = setVegetablesValue(newData[4]);
    }
}
