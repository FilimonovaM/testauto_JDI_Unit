package hw1;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import entities.MetalColorFormData;
import listeners.AllureAttachmentListeners;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import site.JDIFrameworkSite;

import static com.codeborne.selenide.Selenide.close;
import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

@Listeners(AllureAttachmentListeners.class)
@Features({"JDI test suite"})
@Stories({"check \"Metals & Colors page functionality\""})
public class MetalsAndColorsPageTest extends TestNGBase {

    @BeforeClass(alwaysRun = true)
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebSite.init(JDIFrameworkSite.class);
        logger.info("Run Tests");
        JDIFrameworkSite.indexPage.open();
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        close();
    }

    @Test
    public void checkPageFunctionality() {

// LoginFunction on JDI site as User	user:Piter_Chailovskii	Piter_Chailovskii is logged in
        JDIFrameworkSite.indexPage.headerSection.login(WebPage.getUrl().equalsIgnoreCase(
                JDIFrameworkSite.indexPage.url));
        JDIFrameworkSite.indexPage.headerSection.checkUserName();

// Open Metals & Colors page by Header menu		Metals & Colors page is opened
        JDIFrameworkSite.indexPage.headerSection.clickMetalsAndColorButton();
        JDIFrameworkSite.metalsAndColorsPage.checkOpened();

// Fill form Metals & Colors by data below:	" Summary: 3, 8
        // Elements: Water, Fire
        // Colors: Red
        // Metals: Selen
        // Vegetables: Cucumber,Tomato
// Submit form Metals & Colors"	Form Metals & Colors form is filled
        JDIFrameworkSite.metalsAndColorsPage.metalColorSection.checkMetalColorSection();
// Summary: 11
// Elements: Water, Fire
// Color: Red
// Metal: Selen
// Vegetables: Cucumber, Tomato"
// Result section contains certain data
        JDIFrameworkSite.metalsAndColorsPage.resultSection.checkResultSet();
    }
}
