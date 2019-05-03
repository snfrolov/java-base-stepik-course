package java_base_syntax_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson2Program1Tests {

    private static Lesson2Program1 lesson2Program1;

    @Test
    void lesson2program1FirstTest() {
        assertEquals(lesson2Program1.booleanExpression(false, true, true, false), true);
    }

    @Test
    void lesson2program1SecondTest() {
        assertEquals(lesson2Program1.booleanExpression(true, false, true, false), true);
    }

    @Test
    void lesson2program1ThirdTest() {
        assertEquals(lesson2Program1.booleanExpression(false, false, true, true), true);
    }

    @Test
    void lesson2program1FourthTest() {
        assertEquals(lesson2Program1.booleanExpression(false, true, true, true), false);
    }

    @Test
    void lesson2program1FifthTest() {
        assertEquals(lesson2Program1.booleanExpression(false, false, false, true), false);
    }
}