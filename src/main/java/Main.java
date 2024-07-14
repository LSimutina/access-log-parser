import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();

        int amount = firstNumber + secondNumber;
        System.out.println("Сумма: " + amount);

        int difference = firstNumber - secondNumber;
        System.out.println("Разность: " + difference);

        int multiplying = firstNumber * secondNumber;
        System.out.println("Произведение чисел: " + multiplying);

        double division = (double) firstNumber / secondNumber;
        System.out.println("Частное чисел: " + division);

    }
}