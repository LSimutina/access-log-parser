import static java.awt.geom.Path2D.contains;

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
        do {
            count++;
            x /= 10;
        } while (x != 0);
        return count;
    }

    //Задание 6
    public static boolean equalNum(int x) {
        int y = x % 10;
        for (; x > 0; x /= 10) {
            if (x % 10 != y) {
                return false;
            }
        }
        return true;
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
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    //Задание 2
    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    //Задание 3
    public static int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    //Задание 4
    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        return count;
    }

    //Задание 5
    public static boolean palindrom(int[] arr) {
        for (int i = 0; i <= (arr.length / 2) + 1; i++) {
            if (!(arr[i] == arr[arr.length - 1 - i]))
                return false;
        }
        return true;
    }

    //Задание 6
    public static void reverse(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[res.length - 1 - i] = arr[i];
        }
        for (int i = 0; i < res.length; i++) {
            arr[i] = res[i];
        }
    }

    //Задание 7
    public static int[] reverseBack(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[res.length - 1 - i] = arr[i];
        }
        return res;
    }

    //Задание 8
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] tmp = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            tmp[i] = arr1[i];
        }
        int j = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            tmp[j+i]=arr2[i];
        }
        return tmp;
    }

    //Задание 9
    public static int[] findAll(int[] arr, int x){
        int [] tmp=new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                tmp[count]=i;
                count++;
            }
        }
        int [] res =new int[count];
        for (int i=0; i<res.length; i++){
            res[i]=tmp[i];
        }
        return res;
    }

    //Задание 10
    public static int[] deleteNegative(int[] arr){
        int [] tmp=new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0){
                tmp[count]=arr[i];
                count++;
            }
        }
        int [] res =new int[count];
        for (int i=0; i<res.length; i++){
            res[i]=tmp[i];
        }
        return res;
    }

    //Задание 11
    public static int[] add(int[] arr, int x, int pos){
        int [] res=new int[arr.length+1];
        for (int i = 0; i < pos; i++) {
            res[i]=arr[i];
        }
        res[pos]=x;
        for (int i = pos; i < arr.length; i++) {
            res[i+1]=arr[i];
        }
        return res;
    }

    //Задание 12
    public static int[] add(int[] arr, int[] ins, int pos){
        int [] res=new int[arr.length+ins.length];
        for (int i = 0; i < pos; i++) {
            res[i]=arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            res[pos+i]=ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            res[ins.length+i]=arr[i];
        }
        return res;
    }
}
