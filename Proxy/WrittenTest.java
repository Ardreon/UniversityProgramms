package com.lessons.testyvannya.Proxy;

public class WrittenTest implements Test {
    String ticket;

    public WrittenTest(String ticket) {
        this.ticket = ticket;
        acquire();
    }

    @Override
    public void check() {
        System.out.println("Test " + ticket + "checked");
    }

    void acquire() {
        System.out.println("Test " + ticket + "acquired");
    }
}
