/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Roberts Erts
 */
public class User{
    private String name;
    private String login;
    private String password;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public boolean enter(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }

    public String getName() { return name; }
    public String getLogin() { return login; }
    public String getPassword() { return password; }
}
