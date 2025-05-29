/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Roberts Erts
 */
public class Test {
    private ArrayList<Question> questions;
    private String name;
    private boolean open = false;
    
    public Test(boolean open, String name, ArrayList questions) {
        this.open = open;
        this.name = name;
        this.questions = questions;
    }
    
    public String getName(){
        return name;
    }
    
    public void startTest(){
        open = true;
    }
    
    public void endTest(){
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public ArrayList<Question> getResults() {
        return questions;
    }

    public Question getQuestion(int question) {
        return  question < questions.size() ? questions.get(question) : null;
    }
    
    public Question addQuestion(String name,String[] answer, int rightAnswer){
        return null;
    }

}
