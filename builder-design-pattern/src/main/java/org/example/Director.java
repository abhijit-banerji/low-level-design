package org.example;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1).setAge(30).setName("Arun").setSubjects().build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(2).setAge(32).setName("Raman").setFatherName("MyFatherName").setSubjects().build();
    }
}
