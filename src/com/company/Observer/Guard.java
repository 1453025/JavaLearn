package com.company.Observer;

import com.company.HumanBuilder.Human;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by trangngo on 7/7/17.
 */

public class Guard extends Function implements Subject {

    List<Observer> observers;

    public Guard(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {

        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer: observers){
            observer.update();
        }
    }

    @Override
    public void getUpdate(Observer observer) {

    }
}
