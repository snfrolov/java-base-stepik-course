package java_base_syntax_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lesson2Program7Tests {

    private static Lesson2Program7 lesson2Program7;

    @Test
    void lesson2program7FirstTest() {
        assertEquals(lesson2Program7.isPalindrome("Madam, I'm Adam!"), true);
    }

    @Test
    void lesson2program7SecondTest() {
        assertEquals(lesson2Program7.isPalindrome(""), true);
    }

    @Test
    void lesson2program7ThirdTest() {
        assertEquals(lesson2Program7.isPalindrome("Not a palindrome"), false);
    }
}