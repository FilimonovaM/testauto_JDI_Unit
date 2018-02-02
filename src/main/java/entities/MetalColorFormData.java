package entities;

import com.epam.commons.DataClass;
import enums.ColorsEnum;
import enums.ElementsEnum;
import enums.MetalsEnum;
import enums.VegetablesEnum;

public class MetalColorFormData extends DataClass {
    public String colorDropdown = ColorsEnum.RED.text;
    public String metalDropdown = MetalsEnum.SELEN.text;
    public static ElementsEnum[] elements = {ElementsEnum.WATER, ElementsEnum.FIRE};
    public static VegetablesEnum[] vegetables = {VegetablesEnum.TOMATO, VegetablesEnum.CUCUMBER};
}
