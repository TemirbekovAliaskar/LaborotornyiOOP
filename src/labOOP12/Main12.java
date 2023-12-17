package labOOP12;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main12 {

    public static void main(String[] args) {

//       task 1
//        Supplier<Integer> random = () -> new Random().nextInt(11);
//        int randomNumber = random.get();
//        System.out.println("Random number : " + randomNumber);


        //   task 2
//        Function<Integer,String> check = number -> {
//            if (number > 0){
//                return "Positive number ! ";
//            } else if (number < 0) {
//                return "Negative number ! ";
//            }else {
//                return "0";
//            }
//        };
//
//        System.out.println("Write number :");
//        int numbers = new Scanner(System.in).nextInt();
//        String result = check.apply(numbers);
//        System.out.println(result);

        // task 3
//        Predicate<String> stringCheck = s -> s.startsWith("J") || s.startsWith("N") && s.endsWith("A");
//
//        String testString1 = "Java";
//        String testString2 = "New York";
//        String testString3 = "GPA";
//
//        System.out.println("Строка '" + testString1 + "': " + stringCheck.test(testString1));
//        System.out.println("Строка '" + testString2 + "': " + stringCheck.test(testString2));
//        System.out.println("Строка '" + testString3 + "': " + stringCheck.test(testString3));

        //  task 4

        Predicate<String> stringPredicate = soz -> soz.isEmpty();

        String test = "Hello World !";
        boolean result  = stringPredicate.test(test);
        System.out.println(result);
    }
}
