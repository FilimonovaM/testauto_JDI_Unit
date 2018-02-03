package entities;

import entities.interfaces.IResults;

import static utils.OperationsWithData.*;

public class ResultListData extends MetalColorFormData implements IResults {

    @Override
    public String getLog(String name, String... values) {
        return replaceLine(name, values);
    }

    private String resultOfCalculation = intToString(summary(
            new int[]{stringToInt(oddsRadioButton), stringToInt(evenRadioButton)}));

//    private String calculationResult =
//    private String elementsResult = ;
//    private String colorResult =
//    private String metalResult = ;
//    private String vegetablesResult = ;

    public String[] results = {
            getLog("Summary: ", resultOfCalculation),
            getLog("Elements: ", elements),
            getLog("Color: ", colorDropdown),
            getLog("Metal: ", metalDropdown),
            getLog("Vegetables: ", vegetables)};
}
