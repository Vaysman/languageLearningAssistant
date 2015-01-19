package actions;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.RoleDAOImpl;
import model.dao.UserDAOImpl;
import model.entities.Role;
import model.entities.User;

public class RegisterAction extends ActionSupport{
    
    @Override
    public String execute() throws Exception {
        UserDAOImpl udi = new UserDAOImpl();
        User user = new User();
        user.setName(name);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setLogin(login);
        user.setPassword(password);
        Role role = new RoleDAOImpl().findByName("user");
        user.setRole(role);
        try {
          udi.add(user);
        } catch(Exception e) {
            setMessage("Registration failed. Please try again.");
            return "FAILURE";
        }        
        return "SUCCESS";
    }
    
    
    private int id;
    private String name;
    private String lastName;
    private String email;
    private String login;
    private String password;
    private String role;
    private String repeatedPassword;
    
    public String getRepeatedPassword() {
        return repeatedPassword;
    }
    public void setRepeatedPassword(String repeatedPassword) {
        this.repeatedPassword = repeatedPassword;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
    private String message;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
