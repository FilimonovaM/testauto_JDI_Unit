package hw1;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import listeners.AllureAttachmentListeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import site.JDIFrameworkSite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static entities.UserFormData.PITER_CHAILOVSKI;
import static enums.InnerMenuEnum.TABLE_WITH_PAGES;
import static enums.MenuEnum.METALS_AND_COLORS;
import static enums.MenuEnum.SERVICE;
import static entities.MetalsColors.DEFAULT_DATA;

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

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        JDIFrameworkSite.metalsAndColorsPage.headerSection.logout();
    }

    @Test
    public void checkPageFunctionality() {

        //1 Piter_Chailovskii is logged in
        JDIFrameworkSite.indexPage.headerSection.login(PITER_CHAILOVSKI);

        //2 Open Metals & Colors page by Header menu		Metals & Colors page is opened
        JDIFrameworkSite.indexPage.headerSection.selectOnMenu(METALS_AND_COLORS.page);

        //3 Fill form Metals & Colors by data below:
        // " Summary: 3, 8  Elements: Water, Fire  Colors: Red  Metals: Selen  Vegetables: Cucumber,Tomato
        JDIFrameworkSite.metalsAndColorsPage.setNewDataToMetalColorForm(DEFAULT_DATA);

        //4 Result section contains certain data
        JDIFrameworkSite.metalsAndColorsPage.checkResultSection(DEFAULT_DATA);

        //5 Extra Level Of Menu
        JDIFrameworkSite.indexPage.headerSection.selectOnMenu(SERVICE.page, TABLE_WITH_PAGES.option);
    }
}
