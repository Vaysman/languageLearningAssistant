package model.dao;

import java.util.List;

import model.entities.User;

public interface UserDAO {
    void add(User user);
    void update(User user);
    void remove(User user);
    List<User> findAll();
    User findById(int id);
    List<User> findByName(String name);
    List<User> findByLastName(String lastName);
    User findByEmail(String email);
    User findByLogin(String login);
}
