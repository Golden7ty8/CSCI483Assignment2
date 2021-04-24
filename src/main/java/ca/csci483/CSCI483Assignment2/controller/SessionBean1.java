/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.csci483.CSCI483Assignment2.controller;

import ca.csci483.CSCI483Assignment2.model.ReviewModel;
import ca.csci483.CSCI483Assignment2.utils.DataUtils;
import ca.csci483.CSCI483Assignment2.model.User;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
//import javax.enterprise.context.RequestScoped;


/**
 *
 * @author alast
 */
@SessionScoped
@Named("sessionBean1")
public class SessionBean1 implements Serializable {

    //private final ApplicationBean1 ab = (ApplicationBean1) DataUtils.findBean("applicationBean1");
    //private User currentUser = null;
    
    private ReviewModel createReviewModel;
    private ReviewModel scoreReviewModel;

    public void addScore() {
    
        scoreReviewModel.addScore();
    
    }
    
    public ReviewModel getCreateReviewModel() {
        return createReviewModel;
    }

    public void setCreateReviewModel(ReviewModel createReviewModel) {
        this.createReviewModel = createReviewModel;
    }

    public ReviewModel getScoreReviewModel() {
        return scoreReviewModel;
    }

    public void setScoreReviewModel(ReviewModel scoreReviewModel) {
        this.scoreReviewModel = scoreReviewModel;
    }
    
    @PostConstruct
    public void initReviewModels() {
        createReviewModel = new ReviewModel();
        scoreReviewModel = new ReviewModel();
    }
    
    public String submitButtonPressed() throws IOException {
        
        ReviewList reviewList = new ReviewList();
        
        reviewList.addReview(createReviewModel);
        
        return "score";
    }
    
    public String viewDetailsButtonPressed(ReviewModel scoreReviewModel) {
    
        setScoreReviewModel(scoreReviewModel);
        
        return "details";
    
    }

    /**
     * <p>
     * Construct a new session data bean instance.</p>
     */
    /*public SessionBean1() {
    }*/

    //More themes at: https://repository.primefaces.org/org/primefaces/themes/
    private String theme = "afterdark";

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    
}
