package com.company.HumanBuilder;

/**
 * Created by trangngo on 7/6/17.
 */
public interface GodCreator {
    Human build();
    GodCreator setEyes(Integer eyes);
    GodCreator setArm(Integer arm);
    GodCreator setSnob(boolean snob);
    GodCreator setMouth(Integer mouth);
    GodCreator setName(String name);
}


