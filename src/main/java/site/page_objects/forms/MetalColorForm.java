package site.page_objects.forms;

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
import enums.ElementsEnum;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class MetalColorForm extends Form<MetalColorFormData> {

    @Css(".vertical-group label")
    public CheckList elements;

    @JDropdown(jroot = @JFindBy(css = ".colors"),
            jlist = @JFindBy(css = "li"),
            jvalue = @JFindBy(css = ".filter-option")
    )
    public Dropdown colorDropdown;

    @FindBy(css = "[type='text']")
    public TextField metalDropdown;

    @FindBy(css = "#salad-dropdown button")
    public Label checkedVegetables;

    @FindBy(css = "#salad-dropdown label")
    public CheckList vegetables;

    @FindBy(css = "button#submit-button")
    public Button submit;

    @Step
    public void checkElementsChecklist(ElementsEnum... elementsEnum) {
        elements.check(MetalColorFormData.elements);
        for (ElementsEnum element : elementsEnum) {
            elements.isSelected(element.text);
        }
    }

    @Step
    public void checkVegetablesDropdown() {
        checkedVegetables.click();
        if (!checkedVegetables.getText().equals("")) {
            String [] arr = checkedVegetables.getText().split(", ");
            for(String s:arr){
                vegetables.check(s);
            }
        }
        vegetables.check(MetalColorFormData.vegetables);
    }
}
