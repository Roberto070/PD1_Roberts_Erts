/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package classes;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roberts Erts
 */
public class AdminTest {

    @Test
    public void testAdminStartTest() {
        DistanceExamenator test = new DistanceExamenator(false, "Test1", new ArrayList<>());
        Admin admin = new Admin("Jānis", "Prozers", "jan3", "123qwerty");
        admin.startTest(test, true);
        assertTrue(test.isWork());
        admin.startTest(test, false);
        assertFalse(test.isWork());
    }
}
