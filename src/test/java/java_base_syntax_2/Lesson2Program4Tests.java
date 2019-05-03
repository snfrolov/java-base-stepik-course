package java_base_syntax_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson2Program4Tests {

    private static Lesson2Program4 lesson2Program4;

    @Test
    void lesson2program4FirstTest() {
        assertEquals(lesson2Program4.flipBit(0, 1), 1);
    }

    @Test
    void lesson2program4SecondTest() {
        assertEquals(lesson2Program4.flipBit(1, 0), -2147483647);
    }

    @Test
    void lesson2program4ThirdTest() {
        assertEquals(lesson2Program4.flipBit(1, 1), 0);
    }

    @Test
    void lesson2program4FourthTest() {
        assertEquals(lesson2Program4.flipBit(1, 32), -2147483647);
    }

    @Test
    void lesson2program4FifthTest() {
        assertEquals(lesson2Program4.flipBit(0, 0), -2147483648);
    }
}