package site.pages.individual.metal_color.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.MetalColorData;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static enums.VegetablesEnum.DEFAULT_VEGETABLE;

public class MetalColorForm extends Form<MetalColorData> {

    @Css(".vertical-group label")
    private CheckList elements;

    @JDropdown(jroot = @JFindBy(css = ".colors"),
            jlist = @JFindBy(css = "li"),
            jvalue = @JFindBy(css = ".filter-option")
    )
    private Dropdown color;

    @FindBy(css = "[type='text']")
    private TextField metals;

    @FindBy(css = "#salad-dropdown button")
    private Label checkedVegetables;

    @FindBy(css = "#salad-dropdown label")
    private CheckList vegetables;

    @FindBy(css = "button#submit-button")
    private Button submit;

    private SummaryForm summaryForm;

    @Step
    public void submit(MetalColorData data) {
        summaryForm.submit(data);
        elements.check(data.getElements());
        color.select(data.getColor());
        metals.setValue(data.getMetals());
        checkedVegetables.click();
        vegetables.check(DEFAULT_VEGETABLE.text);
        for (String vegetable : data.getVegetables()) {
            vegetables.check(vegetable);
        }
        submit.click();
    }
}
