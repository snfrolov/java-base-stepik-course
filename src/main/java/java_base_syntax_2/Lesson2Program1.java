package java_base_syntax_2;

/**
 * Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
 * Во всех остальных случаях метод должен возвращать false.
 */

class Lesson2Program1 {

    static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ^ b) & (c ^ d) | (a ^ c) & (b ^ d);
    }
}