package entities;

import static enums.ColorsEnum.RED;
import static enums.ElementsEnum.FIRE;
import static enums.ElementsEnum.WATER;
import static enums.EvenDigitsEnum.EIGHT;
import static enums.MetalsEnum.SELEN;
import static enums.OddsDigitsEnum.THREE;
import static enums.VegetablesEnum.CUCUMBER;
import static enums.VegetablesEnum.TOMATO;

public class MetalColorData {
    private int[] summary;
    private String[] elements;
    private String color;
    private String metals;
    private String[] vegetables;


    public static final MetalColorData DEFAULT_DATA = new MetalColorData(
            new int[]{THREE.digit, EIGHT.digit},
            new String[]{WATER.text, FIRE.text},
            RED.text,
            SELEN.text,
            new String[]{CUCUMBER.text, TOMATO.text});

    private MetalColorData(int[] summary, String[] elements, String color, String metals, String[] vegetables) {
        this.summary = summary;
        this.elements = elements;
        this.color = color;
        this.metals = metals;
        this.vegetables = vegetables;
    }

    public String getOddsRadioButton() {
        return  String.valueOf(summary[0]);
    }

    public String getEvenRadioButton() {
        return  String.valueOf(summary[1]);
    }

    public String[] getElements() {
        return elements;
    }

    public String getColor() {
        return color;
    }

    public String getMetals() {
        return metals;
    }

    public String[] getVegetables() {
        return vegetables;
    }
}
