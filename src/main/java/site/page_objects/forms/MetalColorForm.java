package site.page_objects.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.MetalColorFormData;
import enums.ElementsEnum;
import enums.MetalsEnum;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class MetalColorForm extends Form<MetalColorFormData>{

    @Css(".vertical-group label")
    public CheckList elements;

    @JDropdown(jroot = @JFindBy(css = ".colors"),
            jlist = @JFindBy(css = "li"),
            jvalue = @JFindBy(css = ".filter-option")
    )
    public Dropdown colorDropdown;

    @FindBy(css = "")
    public Dropdown metalDropdown;

    public Dropdown vegetables;

    @FindBy(css = "button#submit-button")
    public Button submit;


    @Step
    public void checkElementsDropdown(ElementsEnum... elementsEnum) {
        elements.check(elementsEnum);
        for(ElementsEnum element : elementsEnum){
            elements.isSelected(element.text);
        }
    }

    @Step
    public void checkMetalsDropdown(){
        metalDropdown.select(MetalsEnum.SELEN.text);
    }

    @Step
    public void checkVegetablesDropdown(){

    }

}
