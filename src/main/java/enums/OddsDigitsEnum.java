package enums;

public enum OddsDigitsEnum {
    ONE("1"),
    THREE("3"),
    FIVE("5"),
    SEVEN("7");

    public final String VALUE;

    OddsDigitsEnum(String value) {
        this.VALUE = value;
    }
}
