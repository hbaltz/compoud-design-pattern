package com.hbaltz.example.animal.bird.duck.quack_counter;

import com.hbaltz.example.animal.bird.IQuackable;

/**
 * Decorates IQuackable objects to count how many times these objects have quacked in total
 */
public class QuackCounter implements IQuackable {
    private final IQuackable duck;
    private static int numberOfQuacks;

    public QuackCounter(IQuackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    /**
     * @return the number of quacks done by the ducks
     */
    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
