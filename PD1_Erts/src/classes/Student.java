/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Roberts Erts
 */
public class Student extends User{
    private int questionCount = 0;
    private int rightAnswer = 0;

    public Student(String name, String login, String password) {
        super(name, login, password);
    }

    public void getAnswer(Question question, String answer) {
        questionCount++;
        if (question.isCorrect(answer)) {
            rightAnswer++;
        }
    }

    public void clear() {
        questionCount = 0;
        rightAnswer = 0;
    }

    public int getScore() {
        return rightAnswer;
    }
}
