package com.company.State;

/**
 * Created by trangngo on 7/6/17.
 */
public class NewBie implements Kind {


    private static NewBie ourInstance = new NewBie();

    public static NewBie getInstance() {
        return ourInstance;
    }

    private NewBie() {

    }

    @Override
    public String name() {
        return "Thành viên mới";
    }

    @Override
    public Integer caculate(int hours) {
        return 500 * hours;
    }
}
