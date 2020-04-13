package com.lessons.testyvannya.Composite;

public class Student implements Action {
    @Override
    public void action() {
        System.out.println("Студент выбирает тест");
        System.out.println("Студент решает тест");
    }
}
