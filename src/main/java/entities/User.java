package entities;

import com.epam.commons.DataClass;
import enums.UserEnum;

public class User extends DataClass{

    public String name;
    public String login;
    public String password;

    public User(UserEnum userEnum) {
        this.name = userEnum.userName;
        this.login = userEnum.login;
        this.password = userEnum.password;
    }
}
