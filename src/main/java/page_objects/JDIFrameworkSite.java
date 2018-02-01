package page_objects;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.User;
import page_objects.forms.LoginForm;
import page_objects.pages.IndexPage;
import page_objects.pages.MetalsAndColorsPage;
import ru.yandex.qatools.allure.annotations.Step;

@JSite("https://jdi-framework.github.io/tests/")
public class JDIFrameworkSite extends WebSite {
    public static IndexPage indexPage;
    public static LoginForm loginForm;
    public static MetalsAndColorsPage metalsAndColorsPage;

    @Css(".profile-photo")
    public static Button profilePhoto;

    @Step
    public static void login() {
        profilePhoto.click();
        loginForm.loginAs(new User());
    }
}
