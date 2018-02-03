package entities;

import com.epam.commons.DataClass;
import enums.*;

public class MetalColorFormData extends DataClass {
    public String oddsRadioButton = OddsDigitsEnum.THREE.text;
    public String evenRadioButton = EvenDigitsEnum.EIGHT.text;
    public String colorDropdown = ColorsEnum.RED.text;
    public String metalDropdown = MetalsEnum.SELEN.text;
    public static String[] elements = {ElementsEnum.WATER.text, ElementsEnum.FIRE.text};
    public static String[] vegetables = {VegetablesEnum.TOMATO.text, VegetablesEnum.CUCUMBER.text};
}
