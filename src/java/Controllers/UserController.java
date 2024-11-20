
package Controllers;

import java.io.Serializable;
import javax.faces.application.*;
import javax.servlet.http.HttpServletRequest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
;

@ManagedBean(name = "userController")
@ViewScoped
public class UserController {
    
    private String email;
    private String password;
    
    public UserController(){
    }
    public UserController(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPasword(String password) {
        this.password = password;
    }
    
    public void goToLandingPage(){
        this.redirect("/faces/landingPage.xhtml");
    }
    
    public void goToCreateAccount(){
        this.redirect("/faces/createAccount.xhtml");
    }
    
    public void goToIndex(){
        this.redirect("/faces/index.xhtml");
    }
    
     public void redirect(String rute) {
        HttpServletRequest request;
        try {
            request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
            FacesContext.getCurrentInstance().getExternalContext().redirect(request.getContextPath() + rute);
        } catch (Exception e) {

        }
    }
     
     public void confirmar() {
        addMessage("Confirmado", "haz aceptado");
    } 
     
     public void comprar() {
        addMessage("Confirmado", "Haz hecho la compra correctamernte");
    } 
     
     public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
