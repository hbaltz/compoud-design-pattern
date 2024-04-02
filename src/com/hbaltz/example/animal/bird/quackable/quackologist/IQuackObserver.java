package com.hbaltz.example.animal.bird.quackable.quackologist;

import com.hbaltz.example.animal.bird.quackable.IQuackObservable;

/**
 * Modeled a quack observer
 */
public interface IQuackObserver {
    /**
     * @param quackObservable the quack observable that was quacked
     */
    public void update(IQuackObservable quackObservable);
}
