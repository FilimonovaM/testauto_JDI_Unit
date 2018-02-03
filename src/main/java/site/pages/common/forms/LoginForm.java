package site.pages.common.forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import entities.User;


public class LoginForm extends Form<User> {

    @Css("#Login")
    private TextField name;

    @Css("#Password")
    private TextField password;

    @Css("[type=submit]")
    private Button enter;
}
