package entities;

import com.epam.commons.DataClass;
import enums.*;
import ru.yandex.qatools.allure.annotations.Stories;

public class MetalColorFormData extends DataClass {
    public String oddsRadioButton = OddsDigitsEnum.THREE.text;
    public String evenRadioButton = EvenDigitsEnum.EIGHT.text;
    public String colorDropdown = ColorsEnum.RED.text;
    public String metalDropdown = MetalsEnum.SELEN.text;
    public String[] elements = {ElementsEnum.WATER.text, ElementsEnum.FIRE.text};
    public String[] vegetables = {VegetablesEnum.CUCUMBER.text, VegetablesEnum.TOMATO.text};

    @Stories("Data Updating from \'ex8_jdi_metalsColorsDataSet .json\'")
    public void upDateData(String oddsRadioButton, String evenRadioButton, String colorDropdown, String metalDropdown,
                           String[] elements, String[] vegetables){
        setOddsRadioButton(oddsRadioButton);
        setEvenRadioButton(evenRadioButton);
        setColorDropdown(colorDropdown);
        setMetalDropdown(metalDropdown);
        setElements(elements);
        setVegetables(vegetables);
    }

    private void setOddsRadioButton(String oddsRadioButton) {
        this.oddsRadioButton = oddsRadioButton;
    }

    private void setEvenRadioButton(String evenRadioButton) {
        this.evenRadioButton = evenRadioButton;
    }

    private void setColorDropdown(String colorDropdown) {
        this.colorDropdown = colorDropdown;
    }

    private void setMetalDropdown(String metalDropdown) {
        this.metalDropdown = metalDropdown;
    }

    private void setElements(String[] elements) {
        this.elements = elements;
    }

    private void setVegetables(String[] vegetables) {
        this.vegetables = vegetables;
    }
}
