package LabWork;
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Person is speaking...");
    }
}

class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println("Student is studying...");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Student student = new Student("John", 18, 12);
        student.speak(); // Call speak() from Person class
        student.study(); // Call study() from Student class
    }
}

