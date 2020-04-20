package com.lessons.testyvannya.Flyweight;

public class MathTest implements Test {
    String a = "S";
    @Override
    public void questionsCount(int x) {
        System.out.println("{количество вопросов в тесте: " + x + "}, математический тест со сложностью  : " + a);
    }
}
