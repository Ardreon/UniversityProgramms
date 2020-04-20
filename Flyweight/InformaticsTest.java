package com.lessons.testyvannya.Flyweight;

public class InformaticsTest implements Test {
    String a = "SSS";
    @Override
    public void questionsCount(int x) {
        System.out.println("{количество вопросов в тесте: " + x + "}, тест по информатике со сложностью  : " + a);
    }
}
