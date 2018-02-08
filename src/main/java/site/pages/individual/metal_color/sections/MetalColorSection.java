package site.pages.individual.metal_color.sections;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.MetalColorFormData;
import entities.DataUpdate;
import ru.yandex.qatools.allure.annotations.Step;
import site.pages.individual.metal_color.forms.MetalColorForm;

public class MetalColorSection extends Section {
    MetalColorForm metalColorForm;

    @Step
    public void checkMetalColorSection(DataUpdate newData) {
        metalColorForm.setMetalColorFormData(newData);
        metalColorForm.checkSummaryForm();
        metalColorForm.checkElementsChecklist();
        metalColorForm.checkVegetablesDropdown();
        metalColorForm.submit(new MetalColorFormData(newData));
    }
}
