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
    private int percent = 0;
    
    public Result(DistanceExamenator test, int questionsCount, int rightAnswer){
        this.test = test;
        this.questionsCount = questionsCount;
        this.rightAnswer = rightAnswer;
    }
    
    public int getPercent(int rightAnswer , int questionsCount){
        this.percent = (int) ((rightAnswer / (double) questionsCount) * 100);
        return percent;
    }
    
    public int getGradeFromPercent(int percent) {
        if (percent >= 95) return 10;
        else if (percent >= 85) return 9;
        else if (percent >= 75) return 8;
        else if (percent >= 65) return 7;
        else if (percent >= 55) return 6;
        else if (percent >= 45) return 5;
        else if (percent >= 35) return 4;
        else if (percent >= 25) return 3;
        else if (percent >= 15) return 2;
        else return 1;
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

