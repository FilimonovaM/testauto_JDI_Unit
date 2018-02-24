package entities;

import entities.interfaces.IResults;

import static enums.ColorsEnum.DEFAULT_COLOR;
import static enums.EvenDigitsEnum.DEFAULT_SUM;
import static enums.MetalsEnum.DEFAULT_METAL;
import static enums.VegetablesEnum.DEFAULT_VEGETABLE;
import static utils.OperationsWithData.stringToInt;

public class ResultListData implements IResults {

    private String resultOfCalculation;

    @Override
    public String getLog(String name, String... values) {
        return newRasultLine(name, values);
    }

    public String[] getResult(MetalsColors data) {
        resultOfCalculation = (data.getOddsRadioButton() != null && data.getEvenRadioButton() != null) ?
                (Integer.toString(stringToInt(data.getOddsRadioButton()) +
                        stringToInt(data.getEvenRadioButton()))) : DEFAULT_SUM.text;
        return (data.getElements() == null) ?
                new String[]{getLog("Summary: ", resultOfCalculation),
                        getLog("Color: ", (data.getColor() == null) ? DEFAULT_COLOR.text : data.getColor()),
                        getLog("Metal: ", (data.getMetals() == null) ? DEFAULT_METAL.text : data.getMetals()),
                        getLog("Vegetables: ", (data.getVegetables() == null) ? new String[]{DEFAULT_VEGETABLE.text}
                                : data.getVegetables())} :
                new String[]{getLog("Summary: ", resultOfCalculation),
                        getLog("Elements: ", data.getElements()),
                        getLog("Color: ", (data.getColor() == null) ? DEFAULT_COLOR.text : data.getColor()),
                        getLog("Metal: ", (data.getMetals() == null) ? DEFAULT_METAL.text : data.getMetals()),
                        getLog("Vegetables: ", (data.getVegetables() == null) ? new String[]{DEFAULT_VEGETABLE.text}
                                : data.getVegetables())};
    }
}
