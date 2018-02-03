package site.page_objects.pages.individual.metal_color.sections;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.SummaryFormData;
import ru.yandex.qatools.allure.annotations.Step;
import site.page_objects.pages.individual.metal_color.forms.SummaryForm;

public class SummarySection extends Section {

    SummaryForm summaryForm;

    @Step
    public void checkCalculationForm() {
        summaryForm.submit(new SummaryFormData());
    }
}
