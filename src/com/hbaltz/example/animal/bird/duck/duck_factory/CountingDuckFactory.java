package com.hbaltz.example.animal.bird.duck.duck_factory;

import com.hbaltz.example.animal.bird.IQuackable;
import com.hbaltz.example.animal.bird.duck.DuckCall;
import com.hbaltz.example.animal.bird.duck.MallardDuck;
import com.hbaltz.example.animal.bird.duck.RedheadDuck;
import com.hbaltz.example.animal.bird.duck.RubberDuck;
import com.hbaltz.example.animal.bird.duck.quack_counter.QuackCounter;

/**
 * Create duck with the QuackCounter decorator, so the ducks' quack are counted
 */
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public IQuackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public IQuackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public IQuackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public IQuackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
