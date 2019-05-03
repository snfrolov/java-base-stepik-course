package java_base_syntax_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson2Program2Tests {

    private static Lesson2Program2 lesson2Program2;

    @Test
    void lesson2program2FirstTest() {
        assertEquals(lesson2Program2.leapYearCount(0), 0);
    }

    @Test
    void lesson2program2SecondTest() {
        assertEquals(lesson2Program2.leapYearCount(4), 1);
    }

    @Test
    void lesson2program2ThirdTest() {
        assertEquals(lesson2Program2.leapYearCount(100), 24);
    }
}