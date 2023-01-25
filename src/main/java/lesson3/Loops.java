package lesson3;

import static java.lang.Math.sqrt;

public class Loops {
    /**
     * Пример
     *
     * Вычисление факториала
     */
    public static double factorial(int n) {
        double result = 1.0;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Пример
     *
     * Проверка числа на простоту -- результат true, если число простое
     */
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int m = 0; m <= (int) sqrt(n); m+= 2) {
            if (n % m == 0) return false;
        }
        return true;
    }

    /**
     * Пример
     *
     * Проверка числа на совершенность -- результат true, если число совершенное
     */
    public static boolean isPerfect(int n) {
        int sum = 1;
        for (int m = 2; m <= n/2; m++) {
            if (n % m > 0) continue;
            sum += m;
            if (sum > n) break;
        }
        return sum == n;
    }

    /**
     * Пример
     *
     * Найти число вхождений цифры m в число n
     */
    public static int digitCountInNumber(int n, int m) {
        return n == m ? 1 : (n < 10 ? 0 : digitCountInNumber(n / 10, m) + digitCountInNumber(n % 10, m));
    }

    //Ремарка: многие задачи здесь можно решить переиспользованием предыдущих из этого урока =)

    /**
     * Тривиальная
     *
     * Найти количество цифр в заданном числе n.
     * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
     *
     * Использовать операции со строками в этой задаче запрещается.
     */
    public static int digitNumber(int n) {
        //TODO
        return 0;
    }

    /**
     * Простая
     *
     * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
     * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
     */
    public static int fib(int n) {
        //TODO
        return 0;
    }

    /**
     * Простая
     *
     * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
     * минимальное число k, которое делится и на m и на n без остатка
     */
    public static int lcm(int m, int n) {
        //TODO
        return 0;
    }

    /**
     * Простая
     *
     * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
     */
    public static int minDivisor(int n) {
        //TODO
        return 0;
    }

    /**
     * Простая
     *
     * Для заданного числа n > 1 найти максимальный делитель, меньший n
     */
    public static int maxDivisor(int n) {
        return n / minDivisor(n);
    }

    /**
     * Простая
     *
     * Определить, являются ли два заданных числа m и n взаимно простыми.
     * Взаимно простые числа не имеют общих делителей, кроме 1.
     * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
     */
    public static boolean isCoPrime(int m, int n) {
        //TODO
        return false;
    }

    /**
     * Простая
     *
     * Для заданных чисел m и n, m <= n, определить, имеется ли хотя бы один точный квадрат между m и n,
     * то есть, существует ли такое целое k, что m <= k*k <= n.
     * Например, для интервала 21..28 21 <= 5*5 <= 28, а для интервала 51..61 квадрата не существует.
     */
    public static boolean squareBetweenExists(int m, int n) {
        //TODO
        return false;
    }

    /**
     * Средняя
     *
     * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
     *
     *   ЕСЛИ (X четное)
     *     Xслед = X /2
     *   ИНАЧЕ
     *     Xслед = 3 * X + 1
     *
     * например
     *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
     * Данная последовательность рано или поздно встречает X == 1.
     * Написать функцию, которая находит, сколько шагов требуется для
     * этого для какого-либо начального X > 0.
     */
    public static int collatzSteps(int x) {
        //TODO
        return 0;
    }

    /**
     * Средняя
     *
     * Для заданного x рассчитать с заданной точностью eps
     * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
     * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
     */
    public static double sin(double x, double eps) {
        //TODO
        return 0;
    }

    /**
     * Средняя
     *
     * Для заданного x рассчитать с заданной точностью eps
     * cos(x) = 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + ...
     * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
     */
    public static double cos(double x, double eps) {
        //TODO
        return 0;
    }

    /**
     * Средняя
     *
     * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
     *
     * Использовать операции со строками в этой задаче запрещается.
     */
    public static int revert(int n) {
        //TODO
        return 0;
    }

    /**
     * Средняя
     *
     * Проверить, является ли заданное число n палиндромом:
     * первая цифра равна последней, вторая -- предпоследней и так далее.
     * 15751 -- палиндром, 3653 -- нет.
     *
     * Использовать операции со строками в этой задаче запрещается.
     */
    public static boolean isPalindrome(int n) {
        //TODO
        return false;
    }

    /**
     * Средняя
     *
     * Для заданного числа n определить, содержит ли оно различающиеся цифры.
     * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
     *
     * Использовать операции со строками в этой задаче запрещается.
     */
    public static boolean hasDifferentDigits(int n) {
        //TODO
        return false;
    }

    /**
     * Сложная
     *
     * Найти n-ю цифру последовательности из квадратов целых чисел:
     * 149162536496481100121144...
     * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
     *
     * Использовать операции со строками в этой задаче запрещается.
     */
    public static int squareSequenceDigit(int n) {
        //TODO
        return 0;
    }

    /**
     * Сложная
     *
     * Найти n-ю цифру последовательности из чисел Фибоначчи (см. функцию fib выше):
     * 1123581321345589144...
     * Например, 2-я цифра равна 1, 9-я 2, 14-я 5.
     *
     * Использовать операции со строками в этой задаче запрещается.
     */
    public static int fibSequenceDigit(int n) {
        //TODO
        return 0;
    }
}
