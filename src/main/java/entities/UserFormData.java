package entities;


// TODO what the strange name ?
// TODO Just User was not enough ?
public class UserFormData {

    private String login;
    private String password;
    private String userName;

    private UserFormData(String login, String password, String userName) {
        this.login = login;
        this.password = password;
        this.userName = userName;
    }

    public static UserFormData PITER_CHAILOVSKI = new UserFormData("epam", "1234",
            "PITER CHAILOVSKI");

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }



}
