package site.pages.common.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.User;


public class LoginForm extends Form<User> {

    @Css("#Login")
    public TextField login;

    @Css("#Password")
    public TextField password;

    @Css("[type=submit]")
    public Button enter;
}
