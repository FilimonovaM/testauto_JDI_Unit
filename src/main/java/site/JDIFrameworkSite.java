package site;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import site.pages.individual.index.IndexPage;
import site.pages.individual.metal_color.MetalsAndColorsPage;

@JSite("https://jdi-framework.github.io/tests/")
public class JDIFrameworkSite extends WebSite {

    @JPage(url = "index.htm", title = "Index Page")
    public static IndexPage indexPage;

    @JPage(value = "page2.htm", title = "Metal and Colors")
    public static MetalsAndColorsPage metalsAndColorsPage;

}
