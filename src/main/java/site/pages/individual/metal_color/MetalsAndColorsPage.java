package site.pages.individual.metal_color;

import entities.MetalColorData;
import ru.yandex.qatools.allure.annotations.Step;
import site.pages.common.CommonPage;
import site.pages.individual.metal_color.forms.MetalColorForm;
import site.pages.individual.metal_color.sections.ResultSection;

public class MetalsAndColorsPage extends CommonPage {

    private ResultSection resultSection;
    private MetalColorForm metalColorForm;


    @Step
    public void setNewDataToMetalColorForm(MetalColorData newData) {
        metalColorForm.submit(newData);
    }

    @Step
    public void checkResultSection(MetalColorData newData) {
        resultSection.checkResultSet(newData);
    }
}
