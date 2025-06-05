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
public class StudentTest {

    @Test
    public void testSaveAndGetResult() {
        DistanceExamenator test = new DistanceExamenator(false, "Test1", new ArrayList<>());
        Student student = new Student("Roberts", "Erts", "roberterts", "qwerty123");
        student.saveResult(test, 10, 8);
        Result result = student.getResult(test);
        assertNotNull(result);
        assertEquals(8, result.getRightAnswers());
        assertEquals(10, result.getQuestionsCount());
    }
}

