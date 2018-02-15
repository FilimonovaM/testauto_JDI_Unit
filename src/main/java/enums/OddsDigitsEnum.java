package enums;

public enum OddsDigitsEnum {
    DEFAULT_ODDS("1"),
    ONE("1"),
    THREE("3"),
    FIVE("5"),
    SEVEN("7");

    public final String text;

    OddsDigitsEnum(String text) {
        this.text = text;
    }
}
