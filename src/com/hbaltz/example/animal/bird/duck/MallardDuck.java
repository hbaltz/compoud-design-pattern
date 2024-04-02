package com.hbaltz.example.animal.bird.duck;

import com.hbaltz.example.animal.bird.IQuackable;

/**
 * Modeled a mallard duck
 */
public class MallardDuck implements IQuackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
