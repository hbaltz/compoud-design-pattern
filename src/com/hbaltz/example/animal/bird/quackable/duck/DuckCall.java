package com.hbaltz.example.animal.bird.quackable.duck;

import com.hbaltz.example.animal.bird.quackable.IQuackable;
import com.hbaltz.example.animal.bird.quackable.QuackObservable;
import com.hbaltz.example.animal.bird.quackable.quackologist.IQuackObserver;

/**
 * Modeled a device that imitates a duck call
 */
public class DuckCall implements IQuackable {
    private final QuackObservable quackObservable;

    public DuckCall() {
        quackObservable = new QuackObservable(this);
    }

    /**
     * Sound quite like a rela duck but not exactly
     */
    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyQuackObservers();
    }

    @Override
    public void registerQuackObserver(IQuackObserver quackObserver) {
        quackObservable.registerQuackObserver(quackObserver);
    }

    @Override
    public void notifyQuackObservers() {
        quackObservable.notifyQuackObservers();
    }

    @Override
    public String toString() {
        return "Duck Call";
    }
}
