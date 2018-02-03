package site.page_objects.pages.individual.metal_color;

import site.page_objects.pages.common.CommonPage;
import site.page_objects.pages.individual.metal_color.sections.MetalColorSection;
import site.page_objects.pages.individual.metal_color.sections.ResultSection;
import site.page_objects.pages.individual.metal_color.sections.SummarySection;

public class MetalsAndColorsPage extends CommonPage {
    public MetalColorSection metalColorSection = new MetalColorSection();
    public SummarySection summarySection = new SummarySection();
    public ResultSection resultSection = new ResultSection();
}
