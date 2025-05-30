/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    

    public void addUser(String name, String surname, String login, String password) {
        users.add(new Student(name, surname, login, password));
    }


    public void save() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("users.dat"))) {
            out.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("questions.dat"))) {
            out.writeObject(questions);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("users.dat"))) {
            users = (List<User>) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("questions.dat"))) {
            questions = (List<Question>) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
