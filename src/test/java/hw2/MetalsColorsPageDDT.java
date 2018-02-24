package hw2;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import listeners.AllureAttachmentListeners;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import site.JDIFrameworkSite;
import entities.MetalColorData;
import utils.Reader;

import java.util.Map;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static entities.UserFormData.PITER_CHAILOVSKI;
import static enums.InnerMenuEnum.TABLE_WITH_PAGES;
import static enums.MenuEnum.METALS_AND_COLORS;
import static enums.MenuEnum.SERVICE;

@Listeners(AllureAttachmentListeners.class)
@Features({"JDI test suite"})
@Stories({"check \"Metals & Colors page functionality\""})
public class MetalsColorsPageDDT extends TestNGBase {

    @DataProvider(name = "provider")
    public Object[] getDataFromJsonFile() {
        Map<String, MetalColorData> dataMap = Reader.readFile();
        return dataMap.values().toArray();
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
    public void checkPageFunctionality(MetalColorData newData) {
        //1 LoginFunction on JDI site as UserFormData	user:Piter_Chailovskii
        JDIFrameworkSite.indexPage.headerSection.login(PITER_CHAILOVSKI);

        // 2 Open Metals & Colors page by Header menu
        JDIFrameworkSite.indexPage.headerSection.selectOnMenu(METALS_AND_COLORS.page);

        // 3 Fill form Metals & Colors by data below:	 file : ex8_jdi_metalsColorsDataSet .json
        JDIFrameworkSite.metalsAndColorsPage.setNewDataToMetalColorForm(newData);

        //4 Result section contains certain data
        JDIFrameworkSite.metalsAndColorsPage.checkResultSection(newData);

        //5 Extra Level Of Menu
        JDIFrameworkSite.metalsAndColorsPage.headerSection.selectOnMenu(SERVICE.page, TABLE_WITH_PAGES.option);
    }
}
