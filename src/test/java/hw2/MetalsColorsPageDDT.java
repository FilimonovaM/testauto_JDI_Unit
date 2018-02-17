package hw2;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import entities.DataUpdate;
import listeners.AllureAttachmentListeners;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import site.JDIFrameworkSite;
import utils.JsonFileReader;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static entities.DataUpdate.DEFAULT_DATA;
import static enums.InnerMenuEnum.TABLE_WITH_PAGES;
import static enums.MenuEnum.METALS_AND_COLORS;
import static enums.MenuEnum.SERVICE;
import static enums.UserEnum.PITER;

@Listeners(AllureAttachmentListeners.class)
@Features({"JDI test suite"})
@Stories({"check \"Metals & Colors page functionality\""})
public class MetalsColorsPageDDT extends TestNGBase {

    @DataProvider
    public Object[][] getDataFromJsonFile() {
        JsonFileReader jsonFileReader = new JsonFileReader();
        Object[][] objects = jsonFileReader.readFile();
        return objects;
    }

    @BeforeClass(alwaysRun = true)
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebSite.init(JDIFrameworkSite.class);
        logger.info("Run Tests");
        JDIFrameworkSite.indexPage.open();
    }

    @BeforeMethod(alwaysRun = true)
    public void preparePage() {
        //1 LoginFunction on JDI site as User	user:Piter_Chailovskii
        JDIFrameworkSite.indexPage.headerSection.login(PITER);
    }

    @AfterMethod(alwaysRun = true)
    public void refreshPage() {
        JDIFrameworkSite.metalsAndColorsPage.headerSection.logout();
    }

    @Test(dataProvider = "getDataFromJsonFile")
    public void checkPageFunctionality(String[] newData) {

        //2 Open Metals & Colors page by Header menu
        JDIFrameworkSite.indexPage.headerSection.selectOnMenu(METALS_AND_COLORS.page);

        // 3 Fill form Metals & Colors by data below:	 file : ex8_jdi_metalsColorsDataSet .json
        JDIFrameworkSite.metalsAndColorsPage.setNewData(newData);
        JDIFrameworkSite.metalsAndColorsPage.checkMetalColorSection();

        //4 Result section contains certain data
        JDIFrameworkSite.metalsAndColorsPage.resultSection.checkResultSet();

        //5 Extra Level Of Menu
        JDIFrameworkSite.metalsAndColorsPage.headerSection.selectOnMenu(SERVICE.page, TABLE_WITH_PAGES.option);
    }
}
