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
    private String correctAnswer;
    private String[] options;

    public Question(String text, String correctAnswer, String[] options) {
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.options = options;
    }

    public String getText() {
        return text;
    }

    public String[] getOptions() {
        return options;
    }

    public boolean isCorrect(String answer) {
        return correctAnswer.equals(answer);
    }
}