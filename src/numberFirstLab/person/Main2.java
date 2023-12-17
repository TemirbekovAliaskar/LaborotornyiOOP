package numberFirstLab.person;
import numberFirstLab.person.Person;
public class Main2 {
    public static void main(String[] args) {

        Person person1 = new Person("Ali Toktakunov", 37);
        Person person2 = new Person("Ulan Egizbaev", 30);
        System.out.println("Person 1");
        System.out.println(person1.fullName);
        System.out.println(person1.age);
        System.out.println("--------------------");
        System.out.println("Person 2");
        System.out.println(person2.fullName);
        System.out.println(person2.age);

        person1.move();
        person2.talk();
    }
}
