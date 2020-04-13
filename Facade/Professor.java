package com.lessons.testyvannya.Facade;

public class Professor {
    private boolean test = false;

      void create(){
          System.out.println("Test has created");
          this.test = true;
      }

      public boolean hasCreated(){
          return test;
      }

      void check(Student ticket){
          if(ticket.isTestWritten()){
              System.out.println("The test was rated. Good job!");
          }
      }
}
