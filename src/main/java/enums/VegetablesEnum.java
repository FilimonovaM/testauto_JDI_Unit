package enums;

public enum VegetablesEnum {
    CUCUMBER("Cucumber"),
    TOMATO("Tomato"),
    DEFAULT_VEGETABLE("Salad"),
    ONION("Onion");

    public String text;

    VegetablesEnum(String text) {
        this.text = text;
    }
}
