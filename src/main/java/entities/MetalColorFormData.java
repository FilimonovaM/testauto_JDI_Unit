package entities;

import com.epam.commons.DataClass;
import enums.*;
import ru.yandex.qatools.allure.annotations.Stories;

import java.util.ArrayList;
import java.util.List;

public class MetalColorFormData extends DataClass {

    public String oddsRadioButton = OddsDigitsEnum.THREE.text;
    public String evenRadioButton = EvenDigitsEnum.EIGHT.text;
    public String colorDropdown = ColorsEnum.RED.text;
    public String metalDropdown = MetalsEnum.SELEN.text;
    public String[] elements = {ElementsEnum.WATER.text, ElementsEnum.FIRE.text};
    public String[] vegetables = {VegetablesEnum.CUCUMBER.text, VegetablesEnum.TOMATO.text};

    @Stories("Data Updating from \'ex8_jdi_metalsColorsDataSet .json\'")
    public void updateData(String digits, String elements, String color, String metal, String vegetables) {
        setDigitToSummaryRadioButtons(digits);
        setColorDropdown(color);
        setMetalDropdown(metal);
        setElements(elements);
        setVegetables(vegetables);
    }

    private void setDigitToSummaryRadioButtons(String digits) {
        if (digits.length() == 2) {
            oddsRadioButton = digits.substring(0, 1);
            evenRadioButton = digits.substring(1, 2);
        } else {
            oddsRadioButton = OddsDigitsEnum.ONE.text;
            oddsRadioButton = EvenDigitsEnum.TWO.text;
        }
    }

    private void setColorDropdown(String color) {
        colorDropdown = "Colors";
        if (color.length() > 0) {
            for (ColorsEnum existsColor : ColorsEnum.values()) {
                if (existsColor.text.equalsIgnoreCase(color)) {
                    colorDropdown = color;
                    break;
                }
            }
        }
    }

    private void setMetalDropdown(String metal) {
        metalDropdown = metal;
    }

    private void setElements(String elementsFromJson) {
        List<String> list = new ArrayList<>();
        if (elementsFromJson.length() > 0) {
            for (ElementsEnum existsElement : ElementsEnum.values()) {
                if (elementsFromJson.contains(existsElement.text)) {
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
    }

    private void setVegetables(String vegetablesFromJson) {
        List<String> list = new ArrayList<>();
        if (vegetablesFromJson.length() > 0) {
            for (VegetablesEnum existsVegetable : VegetablesEnum.values()) {
                if (vegetablesFromJson.contains(existsVegetable.text)) {
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
