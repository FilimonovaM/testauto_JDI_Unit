package enums;

public enum MenuEnum {
    HOME("Home"),
    CONTACT_FORM("Contact form"),
    SERVICE("Service"),
    METALS_AND_COLORS("Metals & Colors");

    public final String page;

    MenuEnum(String page) {
        this.page = page;
    }
}
