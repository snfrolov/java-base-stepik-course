package java_base_syntax_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson2Program5Tests {

    private static Lesson2Program5 lesson2Program5;

    @Test
    void lesson2program5FirstTest() {
        assertEquals(lesson2Program5.charExpression(32), '|');
    }

    @Test
    void lesson2program5SecondTest() {
        assertEquals(lesson2Program5.charExpression(29), 'y');
    }

    @Test
    void lesson2program5ThirdTest() {
        assertEquals(lesson2Program5.charExpression(0), '\\');
    }
}