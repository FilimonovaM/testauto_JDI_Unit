package enums;

public enum InnerMenuEnum   {
    SERVICE("Service"),
    SUPPORT("Support"),
    DATES("Dates"),
    COMPLEX_TABLE("Complex Table "),
    SIMPLE_TABLE("Simple Table "),
    TABLE_WITH_PAGES("Table with pages"),
    DIFFERENT_ELEMENTS("Different elements");

    public final String option;

    InnerMenuEnum(String option) {
        this.option = option;
    }
}
