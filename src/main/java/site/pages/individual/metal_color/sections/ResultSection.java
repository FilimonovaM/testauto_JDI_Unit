package site.pages.individual.metal_color.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.ResultListData;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class ResultSection extends Section {
    @FindBy(css = ".results li")
    private TextList resultList;

    @Step
    public void checkResultSet() {
        ResultListData resultListData = new ResultListData();
        String logOfSection = resultList.getValue();
        for (String line : resultListData.results) {
            assert logOfSection.contains(line) : "Wrong value of line for the result section: \n" + line;
        }
    }
}
