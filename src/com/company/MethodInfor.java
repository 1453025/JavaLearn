package com.company;

/**
 * Created by trangngo on 7/7/17.
 */
public @interface MethodInfor {
    String author() default "Pankaj";
    String date();
    int revision() default 1;
    String comments();
}
