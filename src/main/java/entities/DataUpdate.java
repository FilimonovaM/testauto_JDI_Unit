package entities;

import enums.*;

import java.util.ArrayList;
import java.util.List;

public class DataUpdate {
    public static String oddsRadioButton = OddsDigitsEnum.THREE.text;
    public static String evenRadioButton = EvenDigitsEnum.EIGHT.text;
    public static String colorDropdown = ColorsEnum.RED.text;
    public static String metalDropdown = MetalsEnum.SELEN.text;
    public static String[] elements = {ElementsEnum.WATER.text, ElementsEnum.FIRE.text};
    public static String[] vegetables = {VegetablesEnum.CUCUMBER.text, VegetablesEnum.TOMATO.text};

    public DataUpdate(){
    }

    public DataUpdate(String[] newData){
        if (newData[0].length() == 2) {
            oddsRadioButton = newData[0].substring(0, 1);
            evenRadioButton = newData[0].substring(1, 2);
        } else {
            oddsRadioButton = OddsDigitsEnum.ONE.text;
            oddsRadioButton = EvenDigitsEnum.TWO.text;
        }
        List<String> list = new ArrayList<>();
        if (newData[1].length() > 0) {
            for (ElementsEnum existsElement : ElementsEnum.values()) {
                if (newData[1].contains(existsElement.text)) {
                    list.add(existsElement.text);
                }
            }
        } else {
            list.add(ElementsEnum.WATER.text);
        }
        elements = new String[list.size()];
        for (int i = 0; i<elements.length; i++){
            elements[i] = list.get(i);
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
        metalDropdown = newData[3];
        list = new ArrayList<>();
        if (newData[4].length() > 0) {
            for (VegetablesEnum existsVegetable : VegetablesEnum.values()) {
                if (newData[4].contains(existsVegetable.text)) {
                    list.add(existsVegetable.text);
                }
            }
        } else {
            list.add(VegetablesEnum.SALAD.text);
        }
        vegetables = new String[list.size()];
        for (int i = 0; i<vegetables.length; i++){
            vegetables[i] = list.get(i);
        }

    }
}
