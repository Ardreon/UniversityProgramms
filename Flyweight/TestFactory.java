package com.lessons.testyvannya.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TestFactory {

    private static final Map<String, Test> tests = new HashMap<>();

    public Test getTest(String testName) {
        Test test = tests.get(testName);
        if (test == null) {
            switch (testName) {
                case "MathTest":
                    test = new MathTest();
                    break;
                case "ChemistryTest":
                    test = new ChemistryTest();
                    break;
                case "InformaticsTest":
                    test = new InformaticsTest();
                    break;
            }
            tests.put(testName, test);
        }
        return test;
    }
}
