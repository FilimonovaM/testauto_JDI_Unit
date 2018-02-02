package entities;

import com.epam.commons.DataClass;
import enums.UserEnum;

public class User extends DataClass {
    public String name = UserEnum.PITER.userName;
    public String password = UserEnum.PITER.password;
}
