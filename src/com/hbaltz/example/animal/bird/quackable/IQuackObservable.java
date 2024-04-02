package com.hbaltz.example.animal.bird.quackable;

import com.hbaltz.example.animal.bird.quackable.quackologist.IQuackObserver;

/**
 * This interface should be implemented by IQuackable classes that wants to be observed
 */
public interface IQuackObservable {
    public void registerQuackObserver(IQuackObserver quackObserver);
    public void notifyQuackObservers();
}
