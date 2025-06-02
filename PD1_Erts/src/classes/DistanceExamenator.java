/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roberts Erts
 */
public class DistanceExamenator{
    private List<User> users = new ArrayList<>();
    private List<Question> questions = new ArrayList<>();
    private String name;
    private boolean work = false;

    public DistanceExamenator(boolean work, String name, ArrayList questions) {
        this.work = work;
        this.name = name;
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void getResults() {
        // Implement result display
    }

    public void getAvgResults() {
        // Implement average calculation
    }
    
    public String getName(){
        return name;
    }
    
    public void startTest(){
        work = true;
    }
    
    public void endTest(){
        work = false;
    }

    public boolean isWork() {
        return work;
    }

}
