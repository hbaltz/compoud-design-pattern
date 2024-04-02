package com.hbaltz.example.animal.bird.quackable;

import com.hbaltz.example.animal.bird.quackable.quackologist.IQuackObserver;

import java.util.ArrayList;

/**
 * Implements the IQuackObservable, this call is used by other quack observable to manage their observers
 */
public class QuackObservable implements IQuackObservable{
    /**
     * The object that used this class to manage its observers
     */
    private final IQuackObservable duck;
    private final ArrayList<IQuackObserver> quackObserverArrayList = new ArrayList<>();

    public QuackObservable(IQuackObservable quackObservable) {
        this.duck = quackObservable;
    }

    @Override
    public void registerQuackObserver(IQuackObserver quackObserver) {
        quackObserverArrayList.add(quackObserver);
    }

    @Override
    public void notifyQuackObservers() {
        for(IQuackObserver quackObserver : quackObserverArrayList) {
            quackObserver.update(duck);
        }
    }
}
