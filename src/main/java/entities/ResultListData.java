package entities;

import entities.interfaces.IResults;

import static utils.OperationsWithData.*;

public class ResultListData extends DataUpdate implements IResults {

    @Override
    public String getLog(String name, String... values) {
        return replaceLine(name, values);
    }

    private String resultOfCalculation = Integer.toString(stringToInt(oddsRadioButton) + stringToInt(evenRadioButton));

    public String[] results = {
            getLog("Summary: ", resultOfCalculation),
            getLog("Elements: ", elements),
            getLog("Color: ", colorDropdown),
            getLog("Metal: ", metalDropdown),
            getLog("Vegetables: ", vegetables)};
}
