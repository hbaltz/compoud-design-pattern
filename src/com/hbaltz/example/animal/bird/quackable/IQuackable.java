package com.hbaltz.example.animal.bird.quackable;

/**
 * Modeled a thing that can quack
 */
public interface IQuackable extends IQuackObservable {
    /**
     * Defines how to quack
     */
    public void quack();
}
