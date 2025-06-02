package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(10, 75, "Arun");
        System.out.println("Original : " + student.toString());
        Student cloneStudent = (Student) student.clone();
        System.out.println("Clone : " + cloneStudent.toString());
    }
}