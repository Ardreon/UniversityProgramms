package com.lessons.testyvannya.Proxy;

public class UnusedTest implements Test {

    String ticket;
    WrittenTest writtenTest;

    public UnusedTest(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public void check() {
        if(writtenTest==null){
            writtenTest = new WrittenTest(ticket);
        }
    }
}
