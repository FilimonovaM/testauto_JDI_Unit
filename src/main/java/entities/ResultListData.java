package entities;

import entities.interfaces.IResults;

import static enums.ElementsEnum.WATER;
import static utils.OperationsWithData.stringToInt;

public class ResultListData extends DataUpdate implements IResults {

    @Override
    public String getLog(String name, String... values) {
        return replaceLine(name, values);
    }

    private String resultOfCalculation = Integer.toString(stringToInt(oddsRadioButton) + stringToInt(evenRadioButton));

    public String[] results = (elements[0].equals(WATER.text) && elements[0].equals(WATER.text)) ?

            new String[]{getLog("Summary: ", resultOfCalculation),
                    getLog("Color: ", colorDropdown),
                    getLog("Metal: ", metalDropdown),
                    getLog("Vegetables: ", vegetables)} :

            new String[]{getLog("Summary: ", resultOfCalculation),
                    getLog("Elements: ", elements),
                    getLog("Color: ", colorDropdown),
                    getLog("Metal: ", metalDropdown),
                    getLog("Vegetables: ", vegetables)};
}
