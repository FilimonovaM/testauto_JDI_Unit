package entities;

import com.epam.commons.DataClass;
import enums.EvenDigitsEnum;
import enums.OddsDigitsEnum;

public class SummaryFormData extends DataClass {

    public String oddsRadioButtons = OddsDigitsEnum.THREE.text;
    public String evenRadioButtons = EvenDigitsEnum.EIGHT.text;
}
