package java_base_syntax_2;

import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;

/**
 Реализуйте метод, вычисляющий факториал заданного натурального числа.

 Факториал 𝑁 вычисляется как 1⋅2⋅...⋅𝑁.

 Поскольку это очень быстро растущая функция, то даже для небольших 𝑁 вместимости типов int и long очень скоро не хватит.
 Поэтому будем использовать BigInteger.
 */

class Lesson2Program8 {

    static BigInteger factorialForStepik(int value) {
        return value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorialForStepik(value - 1));
    }

    static BigInteger factorial(int value) {
        return BigIntegerMath.factorial(value);
    }
}