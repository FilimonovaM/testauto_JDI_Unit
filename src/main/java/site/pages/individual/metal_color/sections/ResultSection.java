package site.pages.individual.metal_color.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.ResultListData;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

public class ResultSection extends Section {
    @FindBy(css = ".results li")
    private TextList resultList;

    ResultListData metalColorFormData = new ResultListData();

    @Step
    public void checkResultSet() {

        String logOfSection = resultList.getValue();
        for (String line : metalColorFormData.results) {
            if (!logOfSection.contains(line)) {
                Assert.assertEquals("", line);
            }
        }
    }
}
