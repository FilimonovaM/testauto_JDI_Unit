package page_objects.page_sections.metals_page;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import enums.EvenDigitsEnum;
import enums.OddsDigitsEnum;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class CalculatingSection extends Section{

    @FindBy(css = "#odds-selector label")
    public RadioButtons oddsRadioButtons;

    @FindBy(css = "#even-selector label")
    public RadioButtons evenRadioButtons;

    @Css("#calculate-button")
    public Button calculatingButton;

    @Step
    public void calculate(){
        oddsRadioButtons.select(OddsDigitsEnum.THREE.VALUE);
        evenRadioButtons.select(EvenDigitsEnum.EIGHT.VALUE);
        calculatingButton.click();
    }
}
