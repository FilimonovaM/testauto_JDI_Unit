package hw2;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import entities.DataUpdate;
import enums.UserEnum;
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

    }

    @BeforeMethod(alwaysRun = true)
    public void loginAndOpenPage(){
        JDIFrameworkSite.indexPage.open();
        //1 LoginFunction on JDI site as User	user:Piter_Chailovskii
        JDIFrameworkSite.indexPage.headerSection.login(UserEnum.PITER);

        //2 Open Metals & Colors page by Header menu
        JDIFrameworkSite.indexPage.headerSection.clickMetalsAndColorButton();
    }


    @AfterMethod(alwaysRun = true)
    public void back() {
        JDIFrameworkSite.metalsAndColorsPage.refresh();
    }

    @Test(dataProvider = "getDataFromJsonFile", invocationCount = 6)
    public void checkPageFunctionality(String[] newData) {
        //3 Fill form Metals & Colors by data below:	 file : ex8_jdi_metalsColorsDataSet .json
        JDIFrameworkSite.metalsAndColorsPage.metalColorSection.checkMetalColorSection(new DataUpdate(newData));

        //4 Result section contains certain data
        JDIFrameworkSite.metalsAndColorsPage.resultSection.checkResultSet();
    }
}
