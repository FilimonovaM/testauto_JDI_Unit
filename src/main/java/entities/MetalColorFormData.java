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
        this.oddsRadioButton = newData.oddsRadioButton;
        this.evenRadioButton = newData.evenRadioButton;
        this.colorDropdown = newData.colorDropdown;
        this.metalDropdown = newData.metalDropdown;
        this.elements = newData.elements;
        this.vegetables = newData.vegetables;
    }
}
