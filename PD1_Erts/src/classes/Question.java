/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Roberts Erts
 */
public class Question{
    private String text;
    private String[] answer;
    private int correctAnswer;

    public Question(String text, String[] answer, int correctAnswer) {
        this.text = text;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    public String getText() {
        return text;
    }

    public String[] getAnswers() {
        return answer;
    }
    
    public int getCorrectAnswer(){
        return correctAnswer;
    }

    public boolean isCorrect(int answer) {
        return answer == correctAnswer;
    }

}