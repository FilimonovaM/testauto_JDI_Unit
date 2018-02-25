package site.pages.individual.metal_color.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import entities.ResultListData;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;
import entities.MetalColorData;

public class ResultSection extends Section {
    @FindBy(css = ".results li")
    private TextList resultList;

    @Step
    public void checkResultSet(MetalColorData data) {
        String[] expectedResult = new ResultListData().getResult(data);
        String logOfSection = resultList.getValue();
        for (String line : expectedResult) {
            System.out.println(line);
            Assert.assertTrue( logOfSection.contains(line) , "Wrong value of line for the result section: \n"
                    + line);
        }
    }
}
