package actions;

import java.util.List;

import model.dao.RoleDAOImpl;
import model.entities.Role;

public class RegistrationAction {
    public String execute() throws Exception {
        RoleDAOImpl rdi = new RoleDAOImpl();
        setRoles(rdi.findAll());
        return "SUCCESS";
    }
    
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
