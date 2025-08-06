package org.example.Subject;

import org.example.Observer.IObserver;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
    protected  Set<IObserver> set = new HashSet<>();
    void addObserver(IObserver observer) {
        set.add(observer);
    }

    void removeObserver(IObserver observer) {
        set.remove(observer);
    }
    public abstract void notifyObserver();
}
