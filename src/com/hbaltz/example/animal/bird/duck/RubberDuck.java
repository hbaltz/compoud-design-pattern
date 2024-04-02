package com.hbaltz.example.animal.bird.duck;

import com.hbaltz.example.animal.bird.IQuackable;

/**
 * Modeled a rubber duck
 */
public class RubberDuck implements IQuackable {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
