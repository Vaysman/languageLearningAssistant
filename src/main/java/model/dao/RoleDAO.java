package model.dao;

import java.util.List;

import model.entities.Role;

public interface RoleDAO {
    void add(Role role);
    void update(Role role);
    void remove(Role role);
    List<Role> findAll();
    Role findById(int id);
    Role findByName(String name);
}
