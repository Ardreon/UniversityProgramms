package com.lessons.testyvannya.Flyweight;

public class ChemistryTest implements Test {
    String a = "B";
    @Override
    public void questionsCount(int x) {
        System.out.println("{количество вопросов в тесте: " + x + "}, тест по химии со сложностью  : " + a);
    }
}
