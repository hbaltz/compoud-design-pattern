package com.hbaltz.example.animal.bird.quackable.duck;

import com.hbaltz.example.animal.bird.quackable.IQuackable;

/**
 * Modeled a device that imitates a duck call
 */
public class DuckCall implements IQuackable {
    /**
     * Sound quite like a rela duck but not exactly
     */
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
