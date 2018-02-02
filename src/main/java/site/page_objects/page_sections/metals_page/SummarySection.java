package site.page_objects.page_sections.metals_page;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.SummaryFormData;
import ru.yandex.qatools.allure.annotations.Step;
import site.page_objects.forms.SummaryForm;

public class SummarySection extends Section {

    SummaryForm summaryForm = new SummaryForm();

    @Step
    public void checkCalculationForm() {
        summaryForm.submit(new SummaryFormData());
    }
}
