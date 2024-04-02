package com.hbaltz.example.animal.bird.quackable.duck;

import com.hbaltz.example.animal.bird.quackable.IQuackable;
import com.hbaltz.example.animal.bird.goose.Goose;
import com.hbaltz.example.animal.bird.quackable.QuackObservable;
import com.hbaltz.example.animal.bird.quackable.quackologist.IQuackObserver;

/**
 * Adapt a goose class to be used as a duck
 */
public class GooseDuckAdapter implements IQuackable {
    private final QuackObservable quackObservable;
    /**
     * The adapted goose
     */
    private final Goose goose;

    public GooseDuckAdapter(Goose goose) {
        quackObservable = new QuackObservable(this);
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "Goose Duck Adapter";
    }
}
