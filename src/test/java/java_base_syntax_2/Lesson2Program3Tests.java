package java_base_syntax_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson2Program3Tests {

    private static Lesson2Program3 lesson2Program3;

    @Test
    void lesson2program3FirstTest() {
        assertEquals(lesson2Program3.doubleExpression(0.1, 0.2, 0.3), true);
    }

    @Test
    void lesson2program3SecondTest() {
        assertEquals(lesson2Program3.doubleExpression(0, 0, 0), true);
    }

    @Test
    void lesson2program3ThirdTest() {
        assertEquals(lesson2Program3.doubleExpression(10, 10, 1), false);
    }
}