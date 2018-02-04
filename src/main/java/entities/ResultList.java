package entities;

import entities.interfaces.IResults;

import static utils.OperationsWithData.*;

public class ResultList extends MetalColorData {

    IResults iResults=new IResults() {
        @Override
        public String getLog(String name, String... values) {
            return replaceLine(name, values);
        }
    };

    private String resultOfCalculation = intToString(summary(
            new int[]{stringToInt(oddsRadioButton), stringToInt(evenRadioButton)}));

    public String[] results = {
            iResults.getLog("Summary: ", resultOfCalculation),
            iResults.getLog("Elements: ", elements),
            iResults.getLog("Color: ", colorDropdown),
            iResults.getLog("Metal: ", metalDropdown),
            iResults.getLog("Vegetables: ", vegetables)};
}
