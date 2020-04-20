package com.lessons.testyvannya.Flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        TestFactory testFactory = new TestFactory();
        ArrayList<Test> tests = new ArrayList<>();

        tests.add(testFactory.getTest("MathTest"));
        tests.add(testFactory.getTest("MathTest"));
        tests.add(testFactory.getTest("ChemistryTest"));
        tests.add(testFactory.getTest("InformaticsTest"));
        tests.add(testFactory.getTest("ChemistryTest"));
        tests.add(testFactory.getTest("MathTest"));

        Random random = new Random();

        for (Test test : tests) {
            int x = random.nextInt(10);
            test.questionsCount(x);
        }
    }
}
