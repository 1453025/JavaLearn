package com.company.HumanBuilder;

/**
 * Created by trangngo on 7/6/17.
 */
public class Demo {
    public static void main(final String[] arguments) {
        final GodCreator godCreator = new MethodCreator();

        Human human = godCreator.setName("Huy")
                .setArm(2)
                .setEyes(4)
                .setMouth(1)
                .setSnob(true)
                .build();

        System.out.println(human);
    }
}
