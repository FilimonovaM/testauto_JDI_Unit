package enums;

public enum UserEnum {
    PITER("epam","1234","PITER CHAILOVSKI");

    public final String login;
    public final String userName;
    public final String password;

    UserEnum(String login, String password, String name) {
        this.login = login;
        this.userName = name;
        this.password = password;
    }
}
