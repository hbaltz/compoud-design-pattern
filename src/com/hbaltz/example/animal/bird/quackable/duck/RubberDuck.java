package com.hbaltz.example.animal.bird.quackable.duck;

import com.hbaltz.example.animal.bird.quackable.IQuackable;
import com.hbaltz.example.animal.bird.quackable.QuackObservable;
import com.hbaltz.example.animal.bird.quackable.quackologist.IQuackObserver;

/**
 * Modeled a rubber duck
 */
public class RubberDuck implements IQuackable {
    private final QuackObservable quackObservable;

    public RubberDuck() {
        quackObservable = new QuackObservable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
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
        return "Rubber Duck";
    }
}
