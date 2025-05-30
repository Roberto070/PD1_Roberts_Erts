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
public class Student extends User{
    private ArrayList<Result> results = new ArrayList();

    public Student(String name, String surname, String login, String password) {
        super(name, surname, login, password);
    }

    public Result getResult(DistanceExamenator test) {
        for (Result result : results) {
            if (result.getTest() == test) {
                return result;
            }
        }
        return null;
    }

    public void saveResult(DistanceExamenator test, int questionCount, int rightAnswer) {
        Result result = getResult(test);

        if (result == null) {
            results.add(new Result(test, questionCount, rightAnswer));
        } else {
            result.setResult(questionCount, rightAnswer);
        }
    }

}
