package entities;

import utils.RawDataObject;

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

    public DataUpdate() {
    }

    public DataUpdate(String odds, String even, String[] elementArr, String color, String metal,
                      String[] vegetablesArr) {
        oddsRadioButton = odds;
        evenRadioButton = even;
        elements = elementArr;
        colorDropdown = color;
        metalDropdown = metal;
        vegetables = vegetablesArr;
    }

    public DataUpdate(RawDataObject newData) {
        oddsRadioButton = setOddsDigitValue(newData.getSummary());
        evenRadioButton = setEvenDigitValue(newData.getSummary());
        elements = setEvenElementsValue(newData.getElements());
        colorDropdown = setColorValue(newData.getColor());
        metalDropdown = setMetalValue(newData.getMetals());
        vegetables = setVegetablesValue(newData.getVegetables());
    }

    public static final DataUpdate DEFAULT_DATA = new DataUpdate(
            THREE.text,
            EIGHT.text,
            new String[]{WATER.text, FIRE.text},
            RED.text,
            SELEN.text,
            new String[]{CUCUMBER.text, TOMATO.text});

    //only getters for all args are located under this comment & nothing more//
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
