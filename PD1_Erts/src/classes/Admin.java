/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Roberts Erts
 */
class Admin extends User{
    public Admin(String name, String surname, String login, String password) {
        super(name, surname, login, password);
    }

    public void startTest(Test test, boolean state) {
        if (state) {
            test.startTest();
        } else {
            test.endTest();
        }

    }

}
