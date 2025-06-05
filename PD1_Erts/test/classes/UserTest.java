/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package classes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roberts Erts
 */
public class UserTest {

    @Test
    public void testUserEnter() {
        User user = new User("Anna", "Liepa", "annie", "pass123");
        assertTrue(user.enter("annie", "pass123"));
        assertFalse(user.enter("annie", "wrongpass"));
    }
}
