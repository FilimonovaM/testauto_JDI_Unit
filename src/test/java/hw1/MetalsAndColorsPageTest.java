package hw1;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import listeners.AllureAttachmentListeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page_objects.JDIFrameworkSite;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static page_objects.JDIFrameworkSite.indexPage;
import static page_objects.JDIFrameworkSite.login;
import static page_objects.JDIFrameworkSite.metalsAndColorsPage;

@Listeners(AllureAttachmentListeners.class)
@Features({"JDI test suite"})
@Stories({"check \"Metals & Colors page functionality\""})
public class MetalsAndColorsPageTest extends TestNGBase {

    @BeforeClass(alwaysRun = true)
    public void openPage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebSite.init(JDIFrameworkSite.class);
        logger.info("Run Tests");
        indexPage.open();
    }

    @Test
    public void checkPageFunctionality() {

// Login on JDI site as User	user:Piter_Chailovskii	Piter_Chailovskii is logged in
        login();
        indexPage.headerSection.checkUserName();

// Open Metals & Colors page by Header menu		Metals & Colors page is opened
        indexPage.headerSection.clickMetalsAndColorButton();
        metalsAndColorsPage.checkOpened();

// Fill form Metals & Colors by data below:	" Summary: 3, 8
        metalsAndColorsPage.checkForms();
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
