package enums;

public enum ColorsEnum {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue"),
    YELLOW("Yellow");

    public final String text;

    ColorsEnum(String text) {
        this.text = text;
    }
}
