package com.hbaltz.example.animal.bird.duck.duck_factory;

import com.hbaltz.example.animal.bird.IQuackable;
import com.hbaltz.example.animal.bird.duck.DuckCall;
import com.hbaltz.example.animal.bird.duck.MallardDuck;
import com.hbaltz.example.animal.bird.duck.RedheadDuck;
import com.hbaltz.example.animal.bird.duck.RubberDuck;


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
