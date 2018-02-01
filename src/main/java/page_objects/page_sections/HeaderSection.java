package page_objects.page_sections;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import enums.IndexPageEnum;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class HeaderSection extends Section{
    @FindBy(css = ".profile-photo>span")
    public Button userName;

    @FindBy(css = "ul.uui-navigation.nav.navbar-nav.m-l8 [href = 'page2.htm']")
    public Button metalsAndColorsButton;

    @Step
    public void checkUserName() {
        userName.should(Condition.text(IndexPageEnum.NAME.text));
    }

    @Step
    public void clickMetalsAndColorButton() {
        metalsAndColorsButton.click();
    }
}
