/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.csci483.CSCI483Assignment2.controller;

import ca.csci483.CSCI483Assignment2.utils.DataUtils;
import ca.csci483.CSCI483Assignment2.model.User;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.context.RequestScoped;


/**
 *
 * @author osoufan
 */
@RequestScoped
@Named("sessionBean1")
public class SessionBean1 implements Serializable {

    private final ApplicationBean1 ab = (ApplicationBean1) DataUtils.findBean("applicationBean1");
    private User currentUser = null;
    
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }


    /**
     * <p>
     * Construct a new session data bean instance.</p>
     */
    public SessionBean1() {
    }

    //More themes at: https://repository.primefaces.org/org/primefaces/themes/
    private String theme = "smoothness";

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    
}
