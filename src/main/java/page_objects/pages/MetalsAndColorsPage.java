package page_objects.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import page_objects.page_sections.metals_page.ElementsSection;
import page_objects.page_sections.metals_page.MetalColorSection;
import page_objects.page_sections.metals_page.SummarySection;

@JPage(value = "page2.htm", title = "Metal and Colors")
public class MetalsAndColorsPage extends WebPage {
    public MetalColorSection metalColorSection = new MetalColorSection();
    public SummarySection summarySection = new SummarySection();
    public ElementsSection elementsSection = new ElementsSection();

}
