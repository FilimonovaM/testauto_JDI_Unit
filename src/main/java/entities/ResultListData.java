package entities;

import entities.interfaces.IResults;

import static enums.ColorsEnum.DEFAULT_COLOR;
import static enums.EvenDigitsEnum.DEFAULT_SUM;
import static enums.MetalsEnum.DEFAULT_METAL;
import static enums.VegetablesEnum.DEFAULT_VEGETABLE;
import static utils.OperationsWithData.stringToInt;

public class ResultListData extends DataUpdate implements IResults {

    @Override
    public String getLog(String name, String... values) {
        return replaceLine(name, values);
    }

    private String resultOfCalculation = (getOddsRadioButton() != null && getEvenRadioButton() != null) ?
            (Integer.toString(stringToInt(getOddsRadioButton()) +
                    stringToInt(getEvenRadioButton()))) : DEFAULT_SUM.text;

    public String[] results = (getElements() == null) ?
            new String[]{getLog("Summary: ", resultOfCalculation),
                    getLog("Color: ", (getColorDropdown() == null) ? DEFAULT_COLOR.text : getColorDropdown()),
                    getLog("Metal: ", (getMetalDropdown() == null) ? DEFAULT_METAL.text : getMetalDropdown()),
                    getLog("Vegetables: ", (getVegetables() == null) ? new String[]{DEFAULT_VEGETABLE.text}
                            : getVegetables())} :
            new String[]{getLog("Summary: ", resultOfCalculation),
                    getLog("Elements: ", getElements()),
                    getLog("Color: ", (getColorDropdown() == null) ? DEFAULT_COLOR.text : getColorDropdown()),
                    getLog("Metal: ", (getMetalDropdown() == null) ? DEFAULT_METAL.text : getMetalDropdown()),
                    getLog("Vegetables: ", (getVegetables() == null) ? new String[]{DEFAULT_VEGETABLE.text}
                    : getVegetables())};

}
