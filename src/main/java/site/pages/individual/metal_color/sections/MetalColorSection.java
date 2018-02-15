package site.pages.individual.metal_color.sections;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.DataUpdate;
import entities.MetalColorFormData;
import ru.yandex.qatools.allure.annotations.Step;
import site.pages.individual.metal_color.forms.MetalColorForm;

public class MetalColorSection extends Section {
    MetalColorForm metalColorForm;

    @Step
    public void checkMetalColorSection(DataUpdate newData) {
        // TODO NO ! You change state of one entity from another, encapsulate it...
        metalColorForm.setMetalColorFormData(newData);
        metalColorForm.checkSummaryForm();
        metalColorForm.checkElementsChecklist();
        metalColorForm.checkVegetablesDropdown();
        metalColorForm.submit(new MetalColorFormData(newData));
    }
}
