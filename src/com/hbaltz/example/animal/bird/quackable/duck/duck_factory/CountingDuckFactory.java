package com.hbaltz.example.animal.bird.quackable.duck.duck_factory;

import com.hbaltz.example.animal.bird.quackable.IQuackable;
import com.hbaltz.example.animal.bird.quackable.duck.DuckCall;
import com.hbaltz.example.animal.bird.quackable.duck.MallardDuck;
import com.hbaltz.example.animal.bird.quackable.duck.RedheadDuck;
import com.hbaltz.example.animal.bird.quackable.duck.RubberDuck;
import com.hbaltz.example.animal.bird.quackable.quack_counter.QuackCounter;

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
