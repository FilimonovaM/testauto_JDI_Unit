package site.pages.common.sections;

import com.codeborne.selenide.Condition;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.User;
import enums.InnerMenuEnum;
import enums.UserEnum;
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
    private Menu<InnerMenuEnum> serviceMenu;

    @Step
    public void login(UserEnum userEnum) {
        profilePhoto.click();
        // TODO OH MY !!!! Do you really need ENUM and CLASS of user ?
        // TODO could you please chose one of them...
        loginForm.loginAs(new User(userEnum));
        userName.should(Condition.text(userEnum.userName));
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
    public void selectOnMenu(String firstLevelOfMenu, String optionOfInnerLevelOfMenu) {
        menuHeader.select(firstLevelOfMenu);
        System.out.println(menuHeader.getOptionsAsText());
        if (optionOfInnerLevelOfMenu != null && (serviceMenu.isDisplayed())) {
            serviceMenu.clickOn(optionOfInnerLevelOfMenu);
        }
    }
}
