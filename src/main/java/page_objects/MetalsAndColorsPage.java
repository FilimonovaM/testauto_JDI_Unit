package page_objects;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.CheckBox;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;

import java.util.List;

@JPage(value = "page2.htm", title = "Metal and Colors")
public class MetalsAndColorsPage {

    @Css(".vertical-group label")
    public List<CheckBox> forcesOfNature;

    @Css(".form-group colors")
    public Dropdown colors;

    @Css(".form-group metals")
    public Dropdown metals;

    @Css(".dropdown salad")
    public Dropdown vegetables;

    @Css("#submit-button")
    public Button submitButton;

    @Css(".result")
    public Text results;

}
