package com.hbaltz.example.animal.bird.quackable.duck;

import com.hbaltz.example.animal.bird.quackable.IQuackable;
import com.hbaltz.example.animal.bird.quackable.QuackObservable;
import com.hbaltz.example.animal.bird.quackable.quackologist.IQuackObserver;

/**
 * Modeled a redhead duck
 */
public class RedheadDuck implements IQuackable {
    private final QuackObservable quackObservable;

    public RedheadDuck() {
        quackObservable = new QuackObservable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
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
        return "Redhead Duck";
    }
}
