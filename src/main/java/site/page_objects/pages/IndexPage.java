package site.page_objects.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import site.page_objects.page_sections.HeaderSection;

@JPage(url = "index.htm", title = "Index Page")
public class IndexPage extends WebPage {
    public HeaderSection headerSection = new HeaderSection();
}
