package com.lessons.testyvannya.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Action {
    public List<Action> components = new ArrayList<>();

    public void addComponents(Action component) {
        components.add(component);
    }

    public void deleteComponents(Action component) {
        components.remove(component);
    }

    @Override
    public void action() {
        for (Action decision : components) {
            decision.action();
        }
    }
}
