package com.hbaltz.example.animal.bird.quackable.flock;

import com.hbaltz.example.animal.bird.quackable.IQuackable;
import com.hbaltz.example.animal.bird.quackable.quackologist.IQuackObserver;

import java.util.ArrayList;

/**
 * Modeled a flock a ducks
 * (we use the composite pattern)
 */
public class Flock implements IQuackable {
    private final ArrayList<IQuackable> quackerArrayList = new ArrayList<>();
    @Override
    public void quack() {
        for (IQuackable quaker : quackerArrayList) {
            quaker.quack();
        }
    }

    public void add(IQuackable quacker) {
        quackerArrayList.add(quacker);
    }

    /**
     * We delegate the registration of the observer to the children
     * All the quacker registers the observer and
     * they will notify the observer when they quack (only the leaves do that)
     *
     * @param quackObserver the observer that wants to observe the flock
     */
    @Override
    public void registerQuackObserver(IQuackObserver quackObserver) {
        for (IQuackable quacker : quackerArrayList) {
            quacker.registerQuackObserver(quackObserver);
        }
    }

    @Override
    public void notifyQuackObservers() {
        // Already delegate its child (see registerQuackObserver and quack implementation)
    }
}
