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
import entities.MetalColorFormData;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class MetalColorForm extends Form<MetalColorFormData> {

    @Css(".vertical-group label")
    private CheckList elements;

    @JDropdown(jroot = @JFindBy(css = ".colors"),
            jlist = @JFindBy(css = "li"),
            jvalue = @JFindBy(css = ".filter-option")
    )
    private Dropdown colorDropdown;

    @FindBy(css = "[type='text']")
    private TextField metalDropdown;

    @FindBy(css = "#salad-dropdown button")
    private Label checkedVegetables;

    @FindBy(css = "#salad-dropdown label")
    private CheckList vegetables;

    @FindBy(css = "button#submit-button")
    private Button submit;

    public SummaryForm summaryForm;

    @Step
    public void checkSummaryForm(MetalColorFormData metalColorFormData){
        summaryForm.submit(metalColorFormData);
    }

    @Step
    public void checkElementsChecklist(MetalColorFormData metalColorFormData) {
        elements.check(metalColorFormData.elements);
    }

    @Step
    public void checkVegetablesDropdown(MetalColorFormData metalColorFormData) {
        checkedVegetables.click();
        if (!checkedVegetables.getText().equals("")) {
            String[] chosenVegetables = checkedVegetables.getText().split(", ");
            for (String vegetable : chosenVegetables) {
                vegetables.check(vegetable);
            }
        }
        vegetables.check(metalColorFormData.vegetables);
    }
}
