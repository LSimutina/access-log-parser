public class ArraysAndСycle {
    //Циклы
    //Задание 1
    public static String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x; i++) {
            res += i + " ";
        }
        return res;
    }

    //Задание 2
    public static String reverseListNums(int x) {
        String res = "";
        for (int i = x; i >= 0; i--) {
            res += i + " ";
        }
        return res;
    }

    //Задание 3
    public static String chet(int x) {
        String res = "";
        for (int i = 0; i <= x; i += 2) {
            res += i + " ";
        }
        return res;
    }

    //Задание 4
    public static int pow(int x, int y) {
        int count = 1;
        for (int i = 1; i <= y; i++) {
            count *= x;
        }
        return count;
    }

    //Задание 5
    public static int numLen(long x) {
        int count = 0;
        while (x != 0) {
            count++;
            x /= 10;
        }
        return count;
    }

    //Задание 6
    public static boolean equalNum(int x) {
        int y = x % 10;
        for ( ; x>0; x/=10) {
            if (x % 10 != y) {
                return false;
            }
        } return true;
    }

    //Задание 7
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //Задание 8
    public static void leftTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //Задание 9
    public static void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x - 1; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    //Задание 10
    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        int x = sc.nextInt();
        int count = 1;
        do {
            if (x != randomNum) {
                System.out.println("No, try again");
                count++;
                x = sc.nextInt();
            }
        } while (x != randomNum);
        System.out.println("Yes, it`s " + randomNum);
        System.out.println("Количество попыток: " + count);
    }

    //Массивы
    //Задание 1


    //Задание 2


    //Задание 3


    //Задание 4


    //Задание 5


    //Задание 6


    //Задание 7


    //Задание 8


    //Задание 9


    //Задание 10


    //Задание 11


    //Задание 12

}
