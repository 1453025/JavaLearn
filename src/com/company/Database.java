package com.company;

/**
 * Created by trangngo on 7/5/17.
 */
public class Database {

    String name;

    private Database(){}

    private static Database INSTANCE = new Database();

    public static Database getInstance(){
        return INSTANCE;
    }


    public void demoMethod( ) {
        System.out.println("demoMethod cho singleton " + getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
