package com.hbaltz.example.animal.bird.quackable.duck;

import com.hbaltz.example.animal.bird.quackable.IQuackable;

/**
 * Modeled a redhead duck
 */
public class RedheadDuck implements IQuackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
