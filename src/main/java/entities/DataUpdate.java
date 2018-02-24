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

// TODO What the point of this ???
// TODO I dont get it, what is the reason why you created THREE classes of this ??
// TODO Just imagine that you have more than one this sort of Data...
public class DataUpdate {

    // TODO static fields in this class ?? Really ?
    // TODO You can have only ONE instance of it in all entire program, but you have a lot of data sets
    private static String oddsRadioButton;
    private static String evenRadioButton;
    private static String colorDropdown;
    private static String metalDropdown;
    private static String[] elements;
    private static String[] vegetables;

    public DataUpdate() {
    }

    // TODO it war really bad to set up fields in two different constructors...
    // TODO you can use 'this'
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
