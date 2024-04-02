package com.hbaltz.example.animal.bird.quackable.duck.duck_factory;

import com.hbaltz.example.animal.bird.quackable.IQuackable;
import com.hbaltz.example.animal.bird.quackable.duck.DuckCall;
import com.hbaltz.example.animal.bird.quackable.duck.MallardDuck;
import com.hbaltz.example.animal.bird.quackable.duck.RedheadDuck;
import com.hbaltz.example.animal.bird.quackable.duck.RubberDuck;


/**
 * Create classic duck
 */
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public IQuackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public IQuackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public IQuackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public IQuackable createRubberDuck() {
        return new RubberDuck();
    }
}
