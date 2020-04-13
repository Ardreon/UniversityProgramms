package com.lessons.testyvannya.Composite;

public class Main {
    public static void main(String[] args) {
        Action dean = new Dean();
        Action professor = new Professor();
        Action student = new Student();

        Action student1 = new Student();
        Action professor1 = new Professor();
        Action student2 = new Student();
        Action student3 = new Student();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponents(professor);
        composite1.addComponents(student);
        composite1.addComponents(student1);

        composite2.addComponents(professor1);
        composite2.addComponents(student2);
        composite2.addComponents(student3);

        composite.addComponents(dean);
        composite.addComponents(composite1);
        composite.addComponents(composite2);

        composite.action();
    }
}
