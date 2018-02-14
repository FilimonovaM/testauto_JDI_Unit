package entities;

import com.epam.commons.DataClass;

public class MetalColorFormData extends DataClass {

    public String oddsRadioButton;
    public String evenRadioButton;
    public String colorDropdown;
    public String metalDropdown;
    public String[] elements;
    public String[] vegetables;

    public MetalColorFormData(DataUpdate newData) {
        this.oddsRadioButton = newData.getOddsRadioButton();
        this.evenRadioButton = newData.getEvenRadioButton();
        this.colorDropdown = newData.getColorDropdown();
        this.metalDropdown = newData.getMetalDropdown();
        this.elements = newData.getElements();
        this.vegetables = newData.getVegetables();
    }
}
