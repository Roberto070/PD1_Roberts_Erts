/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Roberts Erts
 */
public class Result {
    private final DistanceExamenator test;
    
    private int questionsCount = 0;
    private int rightAnswer = 0;
    
    public Result(DistanceExamenator test, int questionsCount, int rightAnswer){
        this.test = test;
        this.questionsCount = questionsCount;
        this.rightAnswer = rightAnswer;
    }
    
    public DistanceExamenator getTest(){
        return test;
    }
    
    public int getQuestionsCount(){
        return questionsCount;
    }
    
    public int getRightAnswers(){
        return rightAnswer;
    }
    
    public void setResult(int questionsCount, int rightAnswers){
        this.questionsCount = questionsCount;
        this.rightAnswer = rightAnswers;
    }
    
    public void clear(){
        questionsCount = 0;
        rightAnswer = 0;
    }
}

