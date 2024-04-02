package com.hbaltz.example.animal.bird.quackable.flock;

import com.hbaltz.example.animal.bird.quackable.IQuackable;

import java.util.ArrayList;

/**
 * Modeled a flock a ducks
 * (we use the composite pattern)
 */
public class Flock implements IQuackable {
    private final ArrayList<IQuackable> quackerArrayList = new ArrayList<>();
    @Override
    public void quack() {
        for (IQuackable quaker : quackerArrayList) {
            quaker.quack();
        }
    }

    public void add(IQuackable quacker) {
        quackerArrayList.add(quacker);
    }
}
