package actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.UserDAOImpl;
import model.entities.User;


public class LoginAction extends ActionSupport implements SessionAware {

    @Override
    public String execute() throws Exception {
        User user = new UserDAOImpl().findByLogin(getLogin());
        if(user != null && user.getPassword().equals(getPassword())) {
          return "SUCCESS";
        } else {
          setMessage("Authorization failed. Please try again.");
          return "FAILURE";
        }        
    }
    private String message;
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    private String login;
    private String password;
    
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
    
    private Map<String, Object> session;
    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;        
    }     
}