package site.pages.individual.metal_color;

import ru.yandex.qatools.allure.annotations.Step;
import site.pages.common.CommonPage;
import site.pages.individual.metal_color.forms.MetalColorForm;
import site.pages.individual.metal_color.sections.ResultSection;
import entities.MetalsColors;

public class MetalsAndColorsPage extends CommonPage {

    private ResultSection resultSection;
    public MetalColorForm metalColorForm;


    @Step
    public void setNewDataToMetalColorForm(MetalsColors newData) {
        metalColorForm.submit(newData);
    }

    @Step
    public void checkResultSection(MetalsColors newData) {
        resultSection.checkResultSet(newData);
    }
}
