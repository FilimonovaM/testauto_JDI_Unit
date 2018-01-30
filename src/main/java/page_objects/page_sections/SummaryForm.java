package page_objects.page_sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import javafx.scene.control.RadioButton;

public class SummaryForm {

    @Css("#even-selector")
    public RadioButtons evenDigits;

    @Css("#odds-selector")
    public RadioButton oddDigits;
}
