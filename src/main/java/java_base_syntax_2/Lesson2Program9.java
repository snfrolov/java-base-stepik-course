package java_base_syntax_2;

import java.util.Arrays;

import static java.util.stream.IntStream.concat;

/**
 Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив.
 Массивы могут быть любой длины, в том числе нулевой.

 Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив.
 Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
 К сожалению, автоматически это не проверить, так что это остается на вашей совести :)
 */

class Lesson2Program9 {

    static int[] mergeArrays(int[] a1, int[] a2) {
        int i = 0, j = 0;
        int n = a1.length;
        int m = a2.length;
        int[] mergedArray = new int[n + m];
        while (i < n || j < m)
            mergedArray[i + j] = (i < n && (j == m || a1[i] < a2[j])) ? a1[i++] : a2[j++];
        return mergedArray;
    }

    static int[] concatArrays(int[] firstArray, int[] secondArray) {
        return concat(Arrays.stream(firstArray), Arrays.stream(secondArray))
            .sorted()
            .toArray();
    }
}