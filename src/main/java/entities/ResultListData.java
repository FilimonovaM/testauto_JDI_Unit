package entities;

import com.epam.commons.DataClass;
import enums.*;

import static utils.OperationsWithData.*;

public class ResultListData extends DataClass {

    private String calculationResult = String.format("%s%s", "Summary: ", intToString(summary(
            new int[]{stringToInt(OddsDigitsEnum.THREE.text), stringToInt(EvenDigitsEnum.EIGHT.text)})));
    private String elementsResult = String.format("%s%s, %s", "Elements: ",
            ElementsEnum.WATER.text, ElementsEnum.FIRE.text);
    private String colorResult = String.format("%s%s", "Color: ", ColorsEnum.RED.text);
    private String metalResult = String.format("%s%s", "Metal: ", MetalsEnum.SELEN.text);
    private String vegetablesResult = String.format("%s%s, %s", "Vegetables: ", VegetablesEnum.CUCUMBER.text,
            VegetablesEnum.TOMATO.text);

    public String[] results = {calculationResult, elementsResult, colorResult, metalResult, vegetablesResult};
}
