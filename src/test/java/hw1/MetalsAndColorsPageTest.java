package hw1;

import base.TestMetalsAndColorsInit;
import listeners.AllureAttachmentListeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static base.SameElementsOfSite.*;

@Listeners(AllureAttachmentListeners.class)
@Features({"JDI test suite"})
@Stories({"check \"Metals & Colors page functionality\""})
public class MetalsAndColorsPageTest extends TestMetalsAndColorsInit {

    @BeforeClass
    public void openPage(){
        indexPage.open();
    }

    @Test
    public void checkPageFunctionality() {

// Login on JDI site as User	user:Piter_Chailovskii	Piter_Chailovskii is logged in
        login();
        indexPage.checkUserName();

// Open Metals & Colors page by Header menu		Metals & Colors page is opened
        indexPage.clickTheMenuButton(indexPage.metalsAndColorsButton);
//        clickTheMenuButton(metalsAndColorsButton);

// Fill form Metals & Colors by data below:	" Summary: 3, 8
// Elements: Water, Fire
// Colors: Red
// Metals: Selen
// Vegetables: Cucumber,Tomato
// Submit form Metals & Colors"	Form Metals & Colors form is filled
// Submit form Metals & Colors		Form Metals & Colors was submitted
// Result sections should contains data  below:	" Summary: 11


// Elements: Water, Fire
// Color: Red
// Metal: Selen
// Vegetables: Cucumber, Tomato"
// Result section contains certain data
    }
}
