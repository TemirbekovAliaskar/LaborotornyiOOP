package labOOP9;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student implements Comparable<Student> {

    private String name;
    private String group;
    private String curs;
    private int ball;


    public Student() {
    }

    public Student(String name, String group, String curs, int ball) {
        this.name = name;
        this.group = group;
        this.curs = curs;
        this.ball = ball;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", curs='" + curs + '\'' +
                ", ball=" + ball +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

    public void deleteStudent(Set<Student> students){
        Set<Student> studentsToRemove = new HashSet<>();
        System.out.println("Student lovest score -70:");
        for (Student student : students) {
            if (student.getBall() >= 70){
                studentsToRemove.add(student);
                System.out.println(student);
            }
        }
        students.removeAll(studentsToRemove);
    }

    public void goToCurs(Set<Student>students){
        boolean isTrue = false;
        Set<Student> set = new HashSet<>();
        System.out.println("Nice ball 70 <");
        for (Student student : students) {
            if (student.getBall() >= 70){
                set.add(student);
                System.out.println(student);
                isTrue = true;
            }
        }
        if (!isTrue){
            System.out.println("Not students !");
        }
        students.addAll(set);
    }
}
