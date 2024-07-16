public class ClassAndMethods {

    //Задание 10
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    //Задание 9
    public static boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
    }

    //Задание 8
    public static boolean isDivisor(int a, int b) {
        if (a < b) return b % a == 0;
        return a % b == 0;
    }

    //Задание 7
    public static boolean isInRange(int a, int b, int num) {
        if (a < b) return (num >= a) && (num <= b);
        return (num >= b) && (num <= a);
    }

    //Задание 6
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x < 'Z';
    }

    //Задание 5
    public static boolean is2Digits(int x) {
        return (x >= 10) && (x < 100);
    }

    //Задание 4
    public static boolean isPositive(int x) {
        return x > 0;
    }

    // Задание 3
    public static int charToNum(char x) {
        return x-48;
    }

    //Задание 2
    public static int sumLastNums(int x) {
        int last = x % 10; //последний знак числа
        int secondLast = (x / 10) % 10; //предпоследний знак числа
        return last + secondLast;
    }

    //Задание 1
    public static double fraction(double x) {
        return x % (int) x;
    }
}
