/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.csci483.CSCI483Assignment2.controller;

import ca.csci483.CSCI483Assignment2.model.ReviewModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author alast
 */

@RequestScoped
@Named("reviewList")
public class ReviewList {
    
    private List<ReviewModel> reviews;
    private String filePath = "reviews.csv";

    public ReviewModel getReview(int index) throws IOException {
    
        return getReviews().get(index);
        
    }
    
    public List<ReviewModel> getReviews() throws IOException {
        
        loadList();
        return reviews;
        
    }

    public void setReviews(List<ReviewModel> reviews) throws IOException {
        
        this.reviews = reviews;
        saveList();
        
    }
    
    private void loadList() throws IOException {
        
        reviews = new ArrayList<ReviewModel>();
        
        File csvFile = new File(filePath);
        if (csvFile.isFile()) {
            
            BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
            String row = "";
            
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");

                if(data.length == 10) {
                    ReviewModel review = new ReviewModel(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], Integer.parseInt(data[8]), Integer.parseInt(data[9]), reviews.size());
                    reviews.add(review);
                } else {
                    System.out.println("\n\nData contained " + data.length + " pieces of data instead of 10.\n\n");
                    System.out.println("data[0] == " + data[0] + "\n\n");
                    System.out.println("row = ?");
                    System.out.println("row = " + row);
                }
                
            }
            
            csvReader.close();
            
        } else {
            System.out.println("File not found.");
        }
    }
    
    private void saveList() throws IOException {
    
        FileWriter csvWriter = new FileWriter(filePath);
        
        for(int i = 0; i < reviews.size(); i++) {
            csvWriter.append(reviews.get(i).getPublicationTitle());
            csvWriter.append(",");
            csvWriter.append(reviews.get(i).getPublicationURL());
            csvWriter.append(",");
            csvWriter.append(reviews.get(i).getSummary());
            csvWriter.append(",");
            csvWriter.append(reviews.get(i).getPosAndNegs());
            csvWriter.append(",");
            csvWriter.append(reviews.get(i).getMajorPoints());
            csvWriter.append(",");
            csvWriter.append(reviews.get(i).getMinorPoints());
            csvWriter.append(",");
            csvWriter.append(reviews.get(i).getRecommendation());
            csvWriter.append(",");
            csvWriter.append(reviews.get(i).getRevAuthor());
            csvWriter.append(",");
            csvWriter.append(String.valueOf(reviews.get(i).getAvgScore()));
            csvWriter.append(",");
            csvWriter.append(String.valueOf(reviews.get(i).getScoreCount()));
            csvWriter.append("\n");
        }
        
        csvWriter.flush();
        csvWriter.close();
        
    }
    
    /*@PostConstruct
    public void initDemoList() {
        
        reviews = new ArrayList<ReviewModel>();
        
        ReviewModel demoReview = new ReviewModel();
        demoReview.setPublicationTitle("How to Kill a Cat");
        reviews.add(demoReview);
        
    }*/
    
    public void addReview(ReviewModel newReview) throws IOException {
        
        loadList();
        
        reviews.add(newReview);
        
        saveList();
        
    }
    
    public void addScore(ReviewModel updatedModel) throws IOException {
    
        loadList();
        
        updatedModel.addScore();
        reviews.get(updatedModel.getListIndex()).copyModel(updatedModel);
    
        saveList();
        
    }
    
}
