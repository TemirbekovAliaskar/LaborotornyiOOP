package numberFirstLab.person;

public class Person {
    public String fullName;
    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {}
    public void move(){
        System.out.println("Walk  : "+ fullName);
    }
    public void talk(){
        System.out.println("Say   : "+ fullName);
    }



}
