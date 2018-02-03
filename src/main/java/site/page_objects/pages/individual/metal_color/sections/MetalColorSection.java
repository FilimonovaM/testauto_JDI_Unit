package site.page_objects.pages.individual.metal_color.sections;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.MetalColorFormData;
import ru.yandex.qatools.allure.annotations.Step;
import site.page_objects.pages.individual.metal_color.forms.MetalColorForm;

public class MetalColorSection extends Section {
    MetalColorForm metalColorForm = new MetalColorForm();

    @Step
    public void checkMetalColorSection() {
        metalColorForm.checkElementsChecklist();
        metalColorForm.checkVegetablesDropdown();
        metalColorForm.submit(new MetalColorFormData());
    }
}
