package site.pages.individual.metal_color.sections;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.MetalColorFormData;
import ru.yandex.qatools.allure.annotations.Step;
import site.pages.individual.metal_color.forms.MetalColorForm;

public class MetalColorSection extends Section {
    MetalColorForm metalColorForm;
    MetalColorFormData metalColorFormData;

    @Step
    public void checkMetalColorSection() {
        metalColorFormData = new MetalColorFormData();
        metalColorForm.checkSummaryForm(metalColorFormData);
        metalColorForm.checkElementsChecklist();
        metalColorForm.checkVegetablesDropdown();
        metalColorForm.submit(metalColorFormData);
    }
}
