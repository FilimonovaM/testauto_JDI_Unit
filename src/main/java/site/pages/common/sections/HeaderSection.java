package site.pages.common.sections;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.User;
import enums.MenuEnum;
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
    private Menu<MenuEnum> menuHeader;

    @JFindBy(css = ".open ul a")
    private Menu<MenuEnum> serviceMenu;

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
    public void selectOnMenu(MenuEnum ... menuButtons) {
        menuHeader.select(menuButtons[0].menuButton);
        if(menuButtons.length==2 && serviceMenu.isDisplayed()){
            serviceMenu.select(menuButtons[1].menuButton);
        }
    }
}
