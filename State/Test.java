package com.lessons.testyvannya.State;

public class Test {
    State state;

    void setState(State state){
        this.state = state;
    }

    void changeState(){
        if (state instanceof Checked) {
            setState(new Uchecked());
        } else if (state instanceof Uchecked){
            setState(new Checked());
        }
    }

    void checking(){
        state.checkedUnchecked();
    }
}
