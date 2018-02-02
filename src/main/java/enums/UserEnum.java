package enums;

public enum UserEnum {
    PITER("epam","1234");

    public final String userName;
    public final String password;

    UserEnum(String name, String password) {
        this.userName = name;
        this.password = password;
    }
}
