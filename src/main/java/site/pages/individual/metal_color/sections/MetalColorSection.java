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
        metalColorForm.setMetalColorFormData(metalColorFormData);
        metalColorForm.checkSummaryForm();
        metalColorForm.checkElementsChecklist();
        metalColorForm.checkVegetablesDropdown();
        metalColorForm.submit(metalColorFormData);
    }

    @Step
    public void checkMetalColorSection(String digits, String elements, String color,
                                       String metal, String vegetables) {
        metalColorFormData = new MetalColorFormData();
        metalColorForm.setMetalColorFormData(metalColorFormData);
        metalColorFormData.updateData(digits, elements, color,
                metal, vegetables);
        metalColorForm.checkSummaryForm();
        metalColorForm.checkElementsChecklist();
        metalColorForm.checkVegetablesDropdown();
        metalColorForm.submit(metalColorFormData);
    }
}
