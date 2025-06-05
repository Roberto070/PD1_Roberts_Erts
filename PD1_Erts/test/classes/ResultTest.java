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
public class ResultTest {

    @Test
    public void testPercentAndGrade() {
        DistanceExamenator test = new DistanceExamenator(false, "Test1", new ArrayList<>());
        Result result = new Result(test, 20, 18);
        int percent = result.getPercent(18, 20);
        assertEquals(90, percent);
        assertEquals(9, result.getGradeFromPercent(percent));
    }

    @Test
    public void testClearAndSetResult() {
        DistanceExamenator test = new DistanceExamenator(false, "Test1", new ArrayList<>());
        Result result = new Result(test, 10, 5);
        result.setResult(20, 15);
        assertEquals(15, result.getRightAnswers());
        assertEquals(20, result.getQuestionsCount());
        result.clear();
        assertEquals(0, result.getRightAnswers());
        assertEquals(0, result.getQuestionsCount());
    }
} 
