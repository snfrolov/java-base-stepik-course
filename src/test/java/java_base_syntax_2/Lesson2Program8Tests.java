package java_base_syntax_2;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson2Program8Tests {

    private static Lesson2Program8 lesson2Program8;

    @Test
    void lesson2program8FirstTest() {
        assertEquals(lesson2Program8.factorial(0), BigInteger.valueOf(1));
        assertEquals(lesson2Program8.factorialForStepik(0), BigInteger.valueOf(1));
    }

    @Test
    void lesson2program8SecondTest() {
        assertEquals(lesson2Program8.factorial(1), BigInteger.valueOf(1));
        assertEquals(lesson2Program8.factorialForStepik(1), BigInteger.valueOf(1));
    }

    @Test
    void lesson2program8ThirdTest() {
        assertEquals(lesson2Program8.factorial(5), BigInteger.valueOf(120));
        assertEquals(lesson2Program8.factorialForStepik(5), BigInteger.valueOf(120));
    }
}