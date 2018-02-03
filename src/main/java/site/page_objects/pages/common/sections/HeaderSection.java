package site.page_objects.pages.common.sections;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.User;
import enums.IndexPageEnum;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import site.page_objects.pages.common.forms.LoginForm;

public class HeaderSection extends Section {

    @FindBy(css = ".profile-photo>span")
    public Button userName;

    @FindBy(css = "ul.uui-navigation.nav.navbar-nav.m-l8 [href = 'page2.htm']")
    public Button metalsAndColorsButton;

    @Css(".profile-photo")
    public Button profilePhoto;

    LoginForm loginForm = new LoginForm();

    @Step
    public void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }

    @Step
    public void checkUserName() {
        userName.should(Condition.text(IndexPageEnum.NAME.text));
    }

    @Step
    public void clickMetalsAndColorButton() {
        metalsAndColorsButton.click();
    }
}
