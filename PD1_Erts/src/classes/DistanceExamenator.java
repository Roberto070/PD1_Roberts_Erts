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
    private User currentUser;

    public static void main(String[] args) {
        DistanceExamenator app = new DistanceExamenator();
        app.load();
        app.save();
    }

    public void addUser(String name, String login, String password) {
        users.add(new Student(name, login, password));
    }

    public User findUser(String login, String password) {
        for (User u : users) {
            if (u.enter(login, password)) {
                currentUser = u;
                return u;
            }
        }
        return null;
    }

    public void addQuestion(String text, String correctAnswer, String[] options) {
        questions.add(new Question(text, correctAnswer, options));
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
}
