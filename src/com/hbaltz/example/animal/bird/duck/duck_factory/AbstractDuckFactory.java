package com.hbaltz.example.animal.bird.duck.duck_factory;

import com.hbaltz.example.animal.bird.IQuackable;

/**
 * Abstract factory, each method create one type of ducks,
 * the subclass will implement the methods to create different families
 */
public abstract class AbstractDuckFactory {

    /**
     * @return a IQuackable mallard duck
     */
    public abstract IQuackable createMallardDuck();
    /**
     * @return a IQuackable redhead duck
     */
    public abstract IQuackable createRedheadDuck();
    /**
     * @return a IQuackable duck call
     */
    public abstract IQuackable createDuckCall();
    /**
     * @return a IQuackable rubber duck
     */
    public abstract IQuackable createRubberDuck();

}
