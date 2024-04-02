package com.hbaltz.example.animal.bird.quackable.duck;

import com.hbaltz.example.animal.bird.quackable.IQuackable;
import com.hbaltz.example.animal.bird.goose.Goose;

/**
 * Adapt a goose class to be used as a duck
 */
public class GooseDuckAdapter implements IQuackable {
    private final Goose goose;

    public GooseDuckAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
