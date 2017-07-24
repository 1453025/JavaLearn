package com.company.HumanBuilder;

/**
 * Created by trangngo on 7/6/17.
 */
public class MethodCreator implements GodCreator {
    Human human;

    public MethodCreator() {
        this.human = new Human();
    }

    @Override
    public Human build(){
        return human.clone();
    }

    @Override
    public GodCreator setEyes(Integer eyes) {
        human.setEyes(eyes);
        return this;
    }

    @Override
    public GodCreator setArm(Integer arm) {
        human.setArm(arm);
        return this;
    }

    @Override
    public GodCreator setSnob(boolean snob) {
        human.setSnob(snob);
        return this;
    }

    @Override
    public GodCreator setMouth(Integer mouth) {
        human.setMouth(mouth);
        return this;
    }

    @Override
    public GodCreator setName(String name) {
        human.setName(name);
        return this;
    }
}
