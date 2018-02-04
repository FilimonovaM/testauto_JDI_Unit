package hw2;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import listeners.AllureAttachmentListeners;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import site.JDIFrameworkSite;
import utils.JsonFileReader;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

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
        //1 LoginFunction on JDI site as User	user:Piter_Chailovskii
        JDIFrameworkSite.indexPage.headerSection.login(WebPage.getUrl().equalsIgnoreCase(
                JDIFrameworkSite.indexPage.url));
    }

    @AfterMethod(alwaysRun = true)
    public void login() {
        JDIFrameworkSite.metalsAndColorsPage.back();
    }

    @Test(dataProvider = "getDataFromJsonFile")
    public void checkPageFunctionality(String digits, String elements, String color, String metal, String vegetables) {

        //2 Open Metals & Colors page by Header menu
        JDIFrameworkSite.indexPage.headerSection.clickMetalsAndColorButton();

        //3 Fill form Metals & Colors by data below:	 file : ex8_jdi_metalsColorsDataSet .json
        JDIFrameworkSite.metalsAndColorsPage.metalColorSection.checkMetalColorSection(digits, elements,
                color, metal, vegetables);

        //4 Result section contains certain data
        JDIFrameworkSite.metalsAndColorsPage.resultSection.checkResultSet();
    }
}
