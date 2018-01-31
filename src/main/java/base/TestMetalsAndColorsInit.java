package base;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;


public class TestMetalsAndColorsInit extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebSite.init(SameElementsOfSite.class);
        logger.info("Run Tests");
    }
}
