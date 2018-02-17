package entities;

import com.epam.commons.DataClass;
import enums.UserEnum;

public class User extends DataClass {

    public String login;
    public String password;
    public String userName;

    public User(UserEnum userEnum) {
        this.login = userEnum.login;
        this.password = userEnum.password;
        this.userName = userEnum.userName;
    }
}
