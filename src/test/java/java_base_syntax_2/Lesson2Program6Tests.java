package java_base_syntax_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson2Program6Tests {

    private static Lesson2Program6 lesson2Program6;

    @Test
    void lesson2program6FirstTest() {
        assertEquals(lesson2Program6.isPowerOfTwo(0), false);
    }

    @Test
    void lesson2program6SecondTest() {
        assertEquals(lesson2Program6.isPowerOfTwo(1), true);
    }

    @Test
    void lesson2program6ThirdTest() {
        assertEquals(lesson2Program6.isPowerOfTwo(-2), true);
    }

    @Test
    void lesson2program6FourthTest() {
        assertEquals(lesson2Program6.isPowerOfTwo(3), false);
    }
}