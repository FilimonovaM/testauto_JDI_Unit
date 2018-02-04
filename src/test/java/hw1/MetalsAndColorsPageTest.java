package hw1;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import entities.DataUpdate;
import enums.UserEnum;
import listeners.AllureAttachmentListeners;
import org.testng.annotations.*;
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

    @BeforeMethod(alwaysRun = true)
    public void login() {
        //1 Piter_Chailovskii is logged in
        JDIFrameworkSite.indexPage.headerSection.login(UserEnum.PITER);
    }

    @AfterClass(alwaysRun = true)
    public void teardown() {
        close();
    }

    @Test
    public void checkPageFunctionality() {

//2 Open Metals & Colors page by Header menu		Metals & Colors page is opened
        JDIFrameworkSite.indexPage.headerSection.clickMetalsAndColorButton();
        JDIFrameworkSite.metalsAndColorsPage.checkOpened();

//3 Fill form Metals & Colors by data below:
// " Summary: 3, 8  Elements: Water, Fire  Colors: Red  Metals: Selen  Vegetables: Cucumber,Tomato
        JDIFrameworkSite.metalsAndColorsPage.metalColorSection.checkMetalColorSection(new DataUpdate());

// Result section contains certain data
        JDIFrameworkSite.metalsAndColorsPage.resultSection.checkResultSet();
    }
}
