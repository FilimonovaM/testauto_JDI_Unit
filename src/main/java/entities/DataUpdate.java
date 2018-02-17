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

    private static String oddsRadioButton;
    private static String evenRadioButton;
    private static String colorDropdown;
    private static String metalDropdown;
    private static String[] elements;
    private static String[] vegetables;

    public static final DataUpdate DEFAULT_DATA = new DataUpdate(new String[]{
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

    public static String getOddsRadioButton() {
        return oddsRadioButton;
    }

    public static String getEvenRadioButton() {
        return evenRadioButton;
    }

    public static String getColorDropdown() {
        return colorDropdown;
    }

    public static String getMetalDropdown() {
        return metalDropdown;
    }

    public static String[] getElements() {
        return elements;
    }

    public static String[] getVegetables() {
        return vegetables;
    }
}
