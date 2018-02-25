package site.pages.common.sections;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.User;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import site.pages.common.forms.LoginForm;

public class HeaderSection extends Section {

    @FindBy(css = ".profile-photo>span")
    private Button userName;

    @Css(".profile-photo")
    private Button profilePhoto;

    @Css(".logout button")
    private Button logoutButton;

    @Css(".form-horizontal")
    private LoginForm loginForm;

    @JFindBy (css = "[role='navigation']>.m-l8 li a")
    private Menu<Enum> menuHeader;

    @JFindBy(css = ".open ul a")
    private Menu<Enum> serviceMenu;

    @Step
    public void login(User data) {
        profilePhoto.click();
        if(loginForm.isDisplayed()){
            loginForm.loginAs(data);
            userName.should(Condition.text(data.getUserName()));
        }

    }

    public void logout() {
        profilePhoto.click();
        logoutButton.click();
    }

    @Step
    public void selectOnMenu(String firstLevelOfMenu) {
        menuHeader.select(firstLevelOfMenu);
            System.out.println(menuHeader.getOptionsAsText());
    }
    @Step
    public void selectOnMenu(String firstLevelOfMenu, String secondLevelOfMenu) {
        menuHeader.select(firstLevelOfMenu);
        System.out.println(menuHeader.getOptionsAsText());
        if (secondLevelOfMenu != null && (serviceMenu.isDisplayed())) {
            serviceMenu.clickOn(secondLevelOfMenu);
        }
    }
}
