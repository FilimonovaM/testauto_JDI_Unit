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
import entities.DataUpdate;
import entities.MetalColorFormData;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static enums.VegetablesEnum.DEFAULT_VEGETABLE;

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

    // TODO you should not store the data in PO !!
    private MetalColorFormData metalColorFormData;

    @Step
    // TODO this method has no relation to PO
    public MetalColorFormData setMetalColorFormData(DataUpdate newData) {
        metalColorFormData = new MetalColorFormData(newData);
        return metalColorFormData;
    }

    @Step
    // TODO this method will not 'check' anything !
    public void checkSummaryForm() {
        summaryForm.submit(metalColorFormData);
    }

    @Step
    public void checkElementsChecklist() {
        // TODO you should encapsulate this behaviour in UI Object
        if (metalColorFormData.elements != null) {
            elements.check(metalColorFormData.elements);
        }
    }

    @Step
    public void checkVegetablesDropdown() {
        // TODO you should encapsulate this behaviour in UI Object
        if (DataUpdate.getVegetables() != null) {
            checkedVegetables.click();
            vegetables.check(DEFAULT_VEGETABLE.text);
            for (String vegetable : metalColorFormData.vegetables) {
                vegetables.check(vegetable);
            }
        }
    }
}
