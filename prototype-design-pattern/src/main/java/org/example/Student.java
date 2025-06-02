package org.example;

public class Student implements Prototype{
    private int age;
    private String name;
    private int rollNumber;

    Student() {}

    Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Prototype clone() {
        return new Student(age, rollNumber, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
