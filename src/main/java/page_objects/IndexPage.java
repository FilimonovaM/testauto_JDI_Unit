package page_objects;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import enums.IndexPageEnum;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

@JPage(url = "index.htm", title = "Index Page")
public class IndexPage extends WebPage {

    @FindBy(css = ".profile-photo>span")
    private Label userName;

    @Css("[href = 'page2.htm']")
    public Button metalsAndColorsButton;

    @Step
    public void checkUserName() {
        userName.should(Condition.text(IndexPageEnum.NAME.text));
    }

    @Step
    public void clickTheMenuButton(Button button){
        button.click();
    }
}
