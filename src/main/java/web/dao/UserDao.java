package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User getId(int id);

    void remove(int id);

    void update(User user);

    List<User> getAll();
}
