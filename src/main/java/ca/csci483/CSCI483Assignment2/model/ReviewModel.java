/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.csci483.CSCI483Assignment2.model;

import java.util.List;

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
    String recommendation;
    String revAuthor;
    
    int avgScore;
    int scoreCount;
    
    String tmpScore;

    int listIndex;

    
    public ReviewModel() {
        this.publicationTitle = " ";
        this.publicationURL = " ";
        this.summary = " ";
        this.posAndNegs = " ";
        this.majorPoints = " ";
        this.minorPoints = " ";
        this.recommendation = " ";
        this.revAuthor = " ";
        
        this.avgScore = -1;
        this.scoreCount = 0;
        
        this.tmpScore = "";
        
        this.listIndex = -1;
    }

    public ReviewModel(String publicationTitle, String publicationURL, String summary, String posAndNegs, String majorPoints, String minorPoints, String recommendation, String revAuthor, int avgScore, int scoreCount, int listIndex) {
        this.publicationTitle = publicationTitle;
        this.publicationURL = publicationURL;
        this.summary = summary;
        this.posAndNegs = posAndNegs;
        this.majorPoints = majorPoints;
        this.minorPoints = minorPoints;
        this.recommendation = recommendation;
        this.revAuthor = revAuthor;
        
        this.avgScore = avgScore;
        this.scoreCount = scoreCount;
        
        this.tmpScore = "";
        
        this.listIndex = listIndex;
    }
    
    public void copyModel(ReviewModel other) {
        this.publicationTitle = other.publicationTitle;
        this.publicationURL = other.publicationURL;
        this.summary = other.summary;
        this.posAndNegs = other.posAndNegs;
        this.majorPoints = other.majorPoints;
        this.minorPoints = other.minorPoints;
        this.recommendation = other.recommendation;
        this.revAuthor = other.revAuthor;
        
        this.avgScore = other.avgScore;
        this.scoreCount = other.scoreCount;
        
        this.tmpScore = other.tmpScore;
        
        this.listIndex = other.listIndex;
    }

    public void addScore() {
    
        System.out.println(tmpScore);
        
        float floatTmpScore = Float.parseFloat(tmpScore);
        
        //if(intTmpScore == -1)
        //    return "details";
        
        avgScore *= scoreCount;
        scoreCount++;
        avgScore += floatTmpScore;
        avgScore /= scoreCount;
        
        tmpScore = "";
        
        //return "score";
    
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
    
    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getRevAuthor() {
        return revAuthor;
    }

    public void setRevAuthor(String revAuthor) {
        this.revAuthor = revAuthor;
    }
    
    public int getListIndex() {
        return listIndex;
    }

    public void setListIndex(int listIndex) {
        this.listIndex = listIndex;
    }
    
    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    public int getScoreCount() {
        return scoreCount;
    }

    public void setScoreCount(int scoreCount) {
        this.scoreCount = scoreCount;
    }
    
    public String getTmpScore() {
        return tmpScore;
    }

    public void setTmpScore(String tmpScore) {
        this.tmpScore = tmpScore;
    }
    
}
