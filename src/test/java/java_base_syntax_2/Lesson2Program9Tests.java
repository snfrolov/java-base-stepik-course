package java_base_syntax_2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Lesson2Program9Tests {

    private static Lesson2Program9 lesson2Program9;

    @Test
    void lesson2program9FirstTest() {
        assertTrue(Arrays.deepEquals(new int[][]{lesson2Program9.mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3})}, new int[][]{{0, 1, 2, 2, 3}}));
        assertTrue(Arrays.deepEquals(new int[][]{lesson2Program9.concatArrays(new int[]{0, 2, 2}, new int[]{1, 3})}, new int[][]{{0, 1, 2, 2, 3}}));
    }

    @Test
    void lesson2program9SecondTest() {
        assertTrue(Arrays.deepEquals(new int[][]{lesson2Program9.mergeArrays(new int[]{0}, new int[]{0})}, new int[][]{{0, 0}}));
        assertTrue(Arrays.deepEquals(new int[][]{lesson2Program9.concatArrays(new int[]{0}, new int[]{0})}, new int[][]{{0, 0}}));
    }

    @Test
    void lesson2program9ThirdTest() {
        assertTrue(Arrays.deepEquals(new int[][]{lesson2Program9.mergeArrays(new int[]{}, new int[]{})}, new int[][]{{}}));
        assertTrue(Arrays.deepEquals(new int[][]{lesson2Program9.concatArrays(new int[]{}, new int[]{})}, new int[][]{{}}));
    }
}