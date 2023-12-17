package labOOP9;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main9 {
    public static void main(String[] args) {


        //Набор чисел :3

//        Integer [] integer = {12,33,43,65,12,12};
//        Set<Integer> integers = new HashSet<>(List.of(integer));
//        System.out.println(integers);

        Set<Student>students = new TreeSet<>(Set.of(
                new Student("Beku","Bis-1-21","3", 90),
                new Student("Argen","Bis-1-21","4", 87),
                new Student("Azamat","Bis-2-23","1", 40),
                new Student("Askar","Bis-1-22","2", 50),
                new Student("Aska","Bis-1-22","2", 50),
                new Student("Asar","Bis-3-25","3", 78)
        ));
        System.out.println("All Students "+students);
        System.out.println("-------------");
        new Student().deleteStudent(students);
        System.out.println(students);
        System.out.println("------------------");
        new Student().goToCurs(students);














    }
}
