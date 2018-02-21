package site.pages.individual.metal_color;

import entities.DataUpdate;
import entities.MetalColorFormData;
import ru.yandex.qatools.allure.annotations.Step;
import site.pages.common.CommonPage;
import site.pages.individual.metal_color.forms.MetalColorForm;
import site.pages.individual.metal_color.sections.ResultSection;
import utils.RawDataObject;

public class MetalsAndColorsPage extends CommonPage {

    public ResultSection resultSection;
    MetalColorForm metalColorForm;

    // TODO you should not store data in PO
    MetalColorFormData metalColorFormData;

    @Step
    public void setNewData(DataUpdate newData) {
        metalColorFormData = metalColorForm.setMetalColorFormData(newData);
    }

    @Step
    public void setNewData(RawDataObject newData) {
        metalColorFormData = metalColorForm.setMetalColorFormData(new DataUpdate(newData));
    }

    @Step
    public void checkMetalColorSection() {
        checkSettingNewValues();
        metalColorForm.submit(metalColorFormData);
    }

    @Step
    public void checkSettingNewValues() {
        metalColorForm.checkSummaryForm();
        metalColorForm.checkElementsChecklist();
        metalColorForm.checkVegetablesDropdown();
    }
}
