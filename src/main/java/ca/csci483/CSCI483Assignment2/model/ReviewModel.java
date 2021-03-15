/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.csci483.CSCI483Assignment2.model;

/**
 *
 * @author alast
 */
public class ReviewModel {
    
    String publicationTitle;
    String publicationURL;
    String summary;
    String posAndNegs;
    String majorPoints;
    String minorPoints;

    public ReviewModel(String publicationTitle, String publicationURL, String summary, String posAndNegs, String majorPoints, String minorPoints) {
        this.publicationTitle = publicationTitle;
        this.publicationURL = publicationURL;
        this.summary = summary;
        this.posAndNegs = posAndNegs;
        this.majorPoints = majorPoints;
        this.minorPoints = minorPoints;
    }

    public String getPublicationTitle() {
        return publicationTitle;
    }

    public void setPublicationTitle(String publicationTitle) {
        this.publicationTitle = publicationTitle;
    }

    public String getPublicationURL() {
        return publicationURL;
    }

    public void setPublicationURL(String publicationURL) {
        this.publicationURL = publicationURL;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPosAndNegs() {
        return posAndNegs;
    }

    public void setPosAndNegs(String posAndNegs) {
        this.posAndNegs = posAndNegs;
    }

    public String getMajorPoints() {
        return majorPoints;
    }

    public void setMajorPoints(String majorPoints) {
        this.majorPoints = majorPoints;
    }

    public String getMinorPoints() {
        return minorPoints;
    }

    public void setMinorPoints(String minorPoints) {
        this.minorPoints = minorPoints;
    }
    
}
