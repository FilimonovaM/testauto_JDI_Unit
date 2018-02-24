package hw2;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import listeners.AllureAttachmentListeners;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import site.JDIFrameworkSite;
import utils.RawDataObject;
import utils.Reader;

import java.util.Map;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static enums.InnerMenuEnum.TABLE_WITH_PAGES;
import static enums.MenuEnum.METALS_AND_COLORS;
import static enums.MenuEnum.SERVICE;
import static enums.UserEnum.PITER;

@Listeners(AllureAttachmentListeners.class)
@Features({"JDI test suite"})
@Stories({"check \"Metals & Colors page functionality\""})
public class MetalsColorsPageDDT extends TestNGBase {

    // TODO do you really need to return 2-dim array ?
    @DataProvider(name = "provider")
    public Object[][] getDataFromJsonFile() {
        Map<String, RawDataObject> dataMap = Reader.readFile();
        Object[][] dataArray = new Object[dataMap.size()][1];
        Object[] values = dataMap.values().toArray();
        Object[] keys = dataMap.keySet().toArray();
        for (int i = 0; i < dataMap.size(); i++) {
            dataArray[i][0] = values[i];
        }
        return dataArray;
    }

    @BeforeClass(alwaysRun = true)
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebSite.init(JDIFrameworkSite.class);
        logger.info("Run Tests");
        JDIFrameworkSite.indexPage.open();
    }

    @AfterMethod(alwaysRun = true)
    public void refreshPage() {
        JDIFrameworkSite.metalsAndColorsPage.headerSection.logout();
    }

    @Test(dataProvider = "provider")
    public void checkPageFunctionality(RawDataObject newData) {
        //1 LoginFunction on JDI site as User	user:Piter_Chailovskii
        JDIFrameworkSite.indexPage.headerSection.login(PITER);

        // 2 Open Metals & Colors page by Header menu
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
