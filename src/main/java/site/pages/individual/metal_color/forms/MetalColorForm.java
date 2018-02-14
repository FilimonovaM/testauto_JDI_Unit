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

    MetalColorFormData metalColorFormData;

    public void setMetalColorFormData(DataUpdate newData) {
        metalColorFormData = new MetalColorFormData(newData);
    }

    @Step
    public void checkSummaryForm() {
        summaryForm.submit(metalColorFormData);
    }

    @Step
    public void checkElementsChecklist() {
        if (metalColorFormData.elements != null) {
            elements.check(metalColorFormData.elements);
        }
    }

    @Step
    public void checkVegetablesDropdown() {
        if (DataUpdate.getVegetables() != null) {
            checkedVegetables.click();
            vegetables.check(DEFAULT_VEGETABLE.text);
            for(String vegetable : metalColorFormData.vegetables){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                vegetables.check(vegetable);
                System.out.println(vegetable);
            }
        }
    }
}
