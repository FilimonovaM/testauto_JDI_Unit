package site.pages.individual.metal_color.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.MetalColorFormData;
import org.openqa.selenium.support.FindBy;

public class SummaryForm extends Form<MetalColorFormData> {

    @FindBy(css = "#odds-selector label")
    public RadioButtons oddsRadioButton;

    @FindBy(css = "#even-selector label")
    public RadioButtons evenRadioButton;

    @Css("#calculate-button")
    private Button calculatingButton;
}
