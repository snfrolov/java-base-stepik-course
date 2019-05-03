package java_base_syntax_2;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 */

class Lesson2Program5 {

    static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}