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
public class QuestionTest {

    @Test
    public void testQuestionFields() {
        String[] answers = {"Jā", "Nē", "Nezinu"};
        Question q = new Question("Vai tas darbojas?", answers, 0);
        assertEquals("Vai tas darbojas?", q.getText());
        assertArrayEquals(answers, q.getAnswers());
        assertEquals(0, q.getCorrectAnswer());
        assertEquals("Jā", q.isCorrect(0));
    }
}