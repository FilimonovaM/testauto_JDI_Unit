package enums;

public enum EvenDigitsEnum {
    DEFAULT_SUM("3"),
    DEFAULT_EVEN("2"),
    TWO("2"),
    FOUR("4"),
    SIX("6"),
    EIGHT("8");

    public final String text;

    EvenDigitsEnum(String text) {
        this.text = text;
    }
}
