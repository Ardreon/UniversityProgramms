package com.lessons.testyvannya.Facade;

public class Exam {
    Student student = new Student();
    Professor professor = new Professor();

    void test() {
        professor.create();
        student.choose(professor);
        student.writeTest();
        professor.check(student);
    }
}
