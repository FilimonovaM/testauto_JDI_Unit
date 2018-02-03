package site.pages.individual.metal_color.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.ResultListData;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

public class ResultSection extends Section {
    ResultListData result = new ResultListData();
    @FindBy(css = ".results li")
    private TextList resultList;

    @Step
    public void checkResultSet() {
        String logOfSection = resultList.getValue();
        for (String line : result.results) {
            if (!logOfSection.contains(line)) {
                Assert.assertEquals("", line);
            }
        }
    }
}
