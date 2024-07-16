public class Condition {
    //Задание 1
    public static int abs(int x) {
        return x < 0 ? -x : x;
    }

    //Задание 2
    public static int safeDiv(int x, int y) {
        return y != 0 ? x / y : 0;
    }

    //Задание 3
    public static int max(int x, int y) {
        if (x >= y) return x;
        return y;
    }

    //Задание 4
    public static String makeDecision(int x, int y) {
        if (x > y) return x + " > " + y;
        if (x < y) return x + " < " + y;
        return x + " == " + y;
    }

    //Задание 5
    public static int max3(int x, int y, int z) {
        if ((x >= y) && (x >= z)) return x;
        if ((y >= x) && (y >= z)) return y;
        return z;
    }

    //Задание 6
    public static boolean sum3(int x, int y, int z) {
        return (x + y == z) || (y + z == x) || (z + x == y);
    }

    //Задание 7
    public static int sum2(int x, int y) {
        if ((x + y >= 10) && (x + y <= 19)) return 20;
        return x + y;
    }

    //Задание 8
    public static boolean is35(int x) {
        if ((x % 3 == 0) && (x % 5 == 0)) return false;
        return ((x % 3 == 0) || (x % 5 == 0));
    }

    //Задание 9
    public static boolean magic6(int x, int y) {
        return (x == 6) || (y == 6) || (x + y == 6) || (x - y == 6) || (y - x == 6);
    }

    //Задание 10
    public static String age(int x) {
        if ((x % 10 == 1) && (x%100 != 11)) return x + " год";
        if ((x % 10 == 2) && (x%100 != 12)) return x + " года";
        if ((x % 10 == 3) && (x%100 != 13)) return x + " года";
        if ((x % 10 == 4) && (x%100 != 14)) return x + " года";
        return x + " лет";
    }

    //Задание 11
    public static String day(int x) {
        String result = "Это не день недели";
        switch (x) {
            case 1:
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4:
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
            case 7:
                result = "Воскресенье";
                break;
        }
        return result;
    }

    //Задание 12
    public static void printDays(String x) {
        switch (x) {
            case "Понедельник":
                System.out.println("Понедельник");
            case "Вторник":
                System.out.println("Вторник");
            case "Среда":
                System.out.println("Среда");
            case "Четверг":
                System.out.println("Четверг");
            case "Пятница":
                System.out.println("Пятница");
            case "Суббота":
                System.out.println("Суббота");
            case "Воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
        }
    }
}
