package controler;

import data.User;

public interface UserController<T extends User>{
    T create(String firstName, String secondName, String lastName);
}
