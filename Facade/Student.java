package com.lessons.testyvannya.Facade;

public class Student {
    private boolean testExist = false;
    private boolean testWritten = false;

    public boolean choose(Professor test) {
        if (test.hasCreated()) {
            System.out.println("Student has chosen the test");
            testExist = true;
        } else {
            System.out.println("There are no tests to choose from");
        }
        return testExist;
    }

    public void writeTest() {
        if (testExist) {
            System.out.println("Student is writing test...");
            testWritten = true;
        }
    }

    public boolean isTestWritten() {
        return testWritten;
    }
}
