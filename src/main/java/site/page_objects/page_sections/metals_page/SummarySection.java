package site.page_objects.page_sections.metals_page;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.SummaryFormData;
import site.page_objects.forms.SummaryForm;

public class SummarySection extends Section {

    SummaryForm summaryForm = new SummaryForm();

    public void checkCalculationForm() {
        summaryForm.login(new SummaryFormData());
    }
}
