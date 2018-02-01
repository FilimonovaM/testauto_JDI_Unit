package page_objects.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import page_objects.page_sections.metals_page.CalculatingSection;
import ru.yandex.qatools.allure.annotations.Step;

@JPage(value = "page2.htm", title = "Metal and Colors")
public class MetalsAndColorsPage extends WebPage{
    CalculatingSection calculatingSection = new CalculatingSection();
    @Step
    public void checkForms(){
        calculatingSection.calculate();

    }
}
