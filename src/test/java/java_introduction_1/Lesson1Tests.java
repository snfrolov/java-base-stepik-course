package java_introduction_1;

import org.junit.jupiter.api.Test;

class Lesson1Tests {

    private static Lesson1Program1 lesson1Program1;
    private static Lesson1Program2 lesson1Program2;

    @Test
    void program1Test() {
        lesson1Program1.main();
    }

    @Test
    void program2Test() throws Exception {
        lesson1Program2.main();
    }
}