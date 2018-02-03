package site.pages.individual.metal_color.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.SummaryFormData;
import org.openqa.selenium.support.FindBy;

public class SummaryForm extends Form<SummaryFormData> {

    @FindBy(css = "#odds-selector label")
    private RadioButtons oddsRadioButtons;

    @FindBy(css = "#even-selector label")
    private RadioButtons evenRadioButtons;

    @Css("#calculate-button")
    private Button calculatingButton;
}
