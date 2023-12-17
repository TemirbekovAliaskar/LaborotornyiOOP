package labOOP13;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main13 {

    public static void main(String[] args) {

        List<Person> persons = new LinkedList<>(Arrays.asList(
                new Person("Askar",23,4500.8),
                new Person("Duulat",27,49000.89),
                new Person("Argen",19,9400.45)
        ));

        int sumAge = persons.stream().mapToInt(Person::getAge).sum();
        double sumSalary = persons.stream().mapToDouble(Person :: getSalary).sum();

        System.out.println("Sum Age : " + sumAge);
        System.out.println("Sum Salary : " + sumSalary);

        double averageValueAge = persons.stream().collect(Collectors.averagingInt(Person::getAge));
        double averageValueSalary = persons.stream().collect(Collectors.averagingDouble(Person::getSalary));

        System.out.println("Sum average Age : " + averageValueAge);
        System.out.println("Sum average Salary : " + averageValueSalary);


    }
}
