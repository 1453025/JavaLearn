package com.company.Observer;

/**
 * Created by trangngo on 7/7/17.
 */
public class SellBody extends Function implements Observer {

    int cost;

    SellBody(int cost){
        this.cost = cost;
    }

    @Override
    public void update() {
        System.out.println("Em tên " + human.getName() + "! " + getCost() + "k nhé anh.");
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
