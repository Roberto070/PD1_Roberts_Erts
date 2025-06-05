/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roberts Erts
 */
public class DistanceExamenatorTest {

    @Test
    public void testStartAndEndTest() {
        DistanceExamenator test = new DistanceExamenator(false, "Test1", new ArrayList<>());
        test.startTest();
        assertTrue(test.isWork());
        test.endTest();
        assertFalse(test.isWork());
    }

    @Test
    public void testGetNameAndQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Jautajuns?", new String[]{"1", "2", "3"}, 0));
        DistanceExamenator test = new DistanceExamenator(true, "Test", new ArrayList<>(questions));
        assertEquals("Test", test.getName());
        assertEquals(1, test.getQuestions().size());
    }
}