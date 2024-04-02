package com.hbaltz.example.animal.bird.quackable.quackologist;

import com.hbaltz.example.animal.bird.quackable.IQuackObservable;

/**
 * Modeled a quackologist
 */
public class Quackologist implements IQuackObserver{
    @Override
    public void update(IQuackObservable quackObservable) {
        System.out.println("Quackologist: " + quackObservable + " just quacked.");
    }
}
