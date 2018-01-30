package base;

import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.User;
import page_objects.IndexPage;
import page_objects.page_sections.LoginForm;
import ru.yandex.qatools.allure.annotations.Step;

@JSite("https://jdi-framework.github.io/tests/")
public class SameElementsOfSite extends WebSite {
    public static IndexPage indexPage;
    public static LoginForm loginForm;

    @Css(".profile-photo")
    public static Label profilePhoto;


    @Step
    public static void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }
}
