package labOOP11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main11 {

    public static void main(String[] args) {

//    1task
//        UnaryOperator<Integer> square = x -> x * x;
//        int number = 5;
//        int result = square.apply(number);
//
//        System.out.println("Число: " + number);
//        System.out.println("В квадрате: " + result);



        // 2task

//        SumArray sumArray = numbers -> Arrays.stream(numbers).sum();
//
//        int[] numbers = {1,2,3,4,5,6,7};
//        int result = sumArray.sum(numbers);
//        System.out.println("Summa chisel " + result);

//

        Function<Integer, Integer> reverseOrder = number ->
                Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());

        System.out.println("Введите число:");
        int originalNumber = new Scanner(System.in).nextInt();
        int reversedNumber = reverseOrder.apply(originalNumber);

        System.out.println("Исходное число: " + originalNumber);
        System.out.println("Число в обратном порядке: " + reversedNumber);
    }
}
