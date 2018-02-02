package enums;

public enum VegetablesEnum {
    SALAD("Salad"),
    CUCUMBER("Cucumber"),
    TOMATO("Tomato"),
    ONION("Onion");

    public String text;
    VegetablesEnum(String text) {
        this.text = text;
    }
}
