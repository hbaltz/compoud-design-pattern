package com.hbaltz.example.animal.bird.duck;

import com.hbaltz.example.animal.bird.IQuackable;

/**
 * Modeled a redhead duck
 */
public class RedheadDuck implements IQuackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
