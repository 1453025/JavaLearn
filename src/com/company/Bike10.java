package com.company;

/**
 * Created by trangngo on 7/5/17.
 */
public class Bike10{
    final int speedlimit;//bien final trong

    Bike10(){
        speedlimit=70;
        System.out.println(speedlimit);
    }

    public static void main(String args[]){
        new Bike10();
    }
}
