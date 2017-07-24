package com.company.State;

/**
 * Created by trangngo on 7/6/17.
 */
public class Vip implements Kind{
    private static Vip ourInstance = new Vip();

    public static Vip getInstance() {
        return ourInstance;
    }

    private Vip() {
    }

    @Override
    public String name() {
        return "Thành viên Vip";
    }

    @Override
    public Integer caculate(int hours) {
        return 350 * hours;
    }
}
