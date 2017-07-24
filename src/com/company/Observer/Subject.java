package com.company.Observer;

/**
 * Created by trangngo on 7/7/17.
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyAllObservers();
    void getUpdate(Observer observer);
}
