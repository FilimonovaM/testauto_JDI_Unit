package page_objects.page_sections.metals_page;

import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import enums.ElementsEnum;
import ru.yandex.qatools.allure.annotations.Step;

public class ElementsSection extends Section {
    @Css(".vertical-group label")
    public CheckList elements;

    @Step
    public void checkElementsSelection(ElementsEnum ... elementsEnum) {
        elements.check(elementsEnum);
    }
}
