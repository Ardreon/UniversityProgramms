package com.lessons.testyvannya.State;

public class Main {
    public static void main(String[] args) {
        State unChecked = new Uchecked();
        Test test = new Test();

        test.setState(unChecked);

        for(int index = 0; index < 10; index++) {
            test.checking();
            test.changeState();
        }
    }
}
