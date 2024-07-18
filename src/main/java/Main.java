import java.io.File;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //Курсовой проект. Циклы

        int count = 1;
        do {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if ((!fileExists) || (isDirectory)) {
                System.out.println("Путь указан  не верно");
                continue;
            }
            System.out.println("Путь указан  Верно");
            System.out.println("Это файл номер: " + count);
            count++;
        } while (true);

//        Задания из блока 5.Основы Java. Циклы
/*
        System.out.println(ArraysAndСycle.listNums(5)); // Задание 1
        System.out.println(ArraysAndСycle.reverseListNums(5)); // Задание 2
        System.out.println(ArraysAndСycle.chet(9)); // Задание 3
        System.out.println(ArraysAndСycle.pow(2,5)); // Задание 4
        System.out.println(ArraysAndСycle.numLen(0)); // Задание 5
        System.out.println(ArraysAndСycle.equalNum(121)); // Задание 6
        ArraysAndСycle.square(3); // Задание 7
        ArraysAndСycle.leftTriangle(3); // Задание 8
        ArraysAndСycle.rightTriangle(3); // Задание 9
        ArraysAndСycle.guessGame(); // Задание 10
*/
//        Задания из блока 4.Основы Java. Условия
/*
        System.out.println(Condition.abs(-4)); //Задание 1
        System.out.println(Condition.safeDiv(4,6)); //Задание 2
        System.out.println(Condition.max(12,-28)); //Задание 3
        System.out.println(Condition.makeDecision(14,14)); //Задание 4
        System.out.println(Condition.max3(12,12,8)); //Задание 5
        System.out.println(Condition.sum3(8,1,4)); //Задание 6
        System.out.println(Condition.sum2(9,12)); //Задание 7
        System.out.println(Condition.is35(20)); //Задание 8
        System.out.println(Condition.magic6(-2,8)); //Задание 9
        System.out.println(Condition.age(212)); //Задание 10
        System.out.println(Condition.day(8)); //Задание 11
        Condition.printDays("Пятница"); //Задание 12
*/
//        Задания из блока 4.Основы Java. Классы и методы
/*
        String res = String.format("%.3f", ClassAndMethods.fraction(5.3)); //Задание 1
        System.out.println(res); //Задание 1
        System.out.println(ClassAndMethods.sumLastNums(14528)); //Задание 2
        System.out.println(ClassAndMethods.charToNum('9')); //Задание 3
        System.out.println(ClassAndMethods.isPositive(-15)); //Задание 4
        System.out.println(ClassAndMethods.is2Digits(126)); //Задание 5
        System.out.println(ClassAndMethods.isUpperCase('D')); //Задание 6
        System.out.println(ClassAndMethods.isInRange(9, 2, 5)); //Задание 7
        System.out.println(ClassAndMethods.isDivisor(4, 16)); //Задание 8
        System.out.println(ClassAndMethods.isEqual(2, 2, 2)); //Задание 9

        int result = ClassAndMethods.lastNumSum(5, 11); //Задание 10
        System.out.println(result);
        result = ClassAndMethods.lastNumSum(result, 123);
        System.out.println(result);
        result = ClassAndMethods.lastNumSum(result, 14);
        System.out.println(result);
        result = ClassAndMethods.lastNumSum(result, 1);
        System.out.println(result);
*/
//        Задания из блока 3.Основы Java. Первая программа, типы данных
/*
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
*/
    }
}