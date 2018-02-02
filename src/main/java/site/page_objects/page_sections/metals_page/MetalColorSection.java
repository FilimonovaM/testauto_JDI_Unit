package site.page_objects.page_sections.metals_page;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.MetalColorFormData;
import enums.ElementsEnum;
import site.page_objects.forms.MetalColorForm;
import ru.yandex.qatools.allure.annotations.Step;

public class MetalColorSection extends Section {
    MetalColorForm metalColorForm = new MetalColorForm();
    @Step
    public void checkMetalColorSection(ElementsEnum ... elements){
        metalColorForm.checkElementsChecklist(elements);
//        metalColorForm.checkMetalsDropdown();
        metalColorForm.submit(new MetalColorFormData());
    }
}
