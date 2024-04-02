package com.hbaltz.example;

import com.hbaltz.example.animal.bird.quackable.IQuackable;
import com.hbaltz.example.animal.bird.quackable.duck.*;
import com.hbaltz.example.animal.bird.quackable.duck.duck_factory.AbstractDuckFactory;
import com.hbaltz.example.animal.bird.quackable.duck.duck_factory.CountingDuckFactory;
import com.hbaltz.example.animal.bird.quackable.duck.flock.Flock;
import com.hbaltz.example.animal.bird.quackable.duck.quack_counter.QuackCounter;
import com.hbaltz.example.animal.bird.goose.Goose;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        // We use here the counting duck factory, because we want the quack to be counted for each duck we are creating
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        duckSimulator.launchSimulation(countingDuckFactory);
    }

    private void launchSimulation(AbstractDuckFactory duckFactory) {
        // We create a flock of diverse ducks (not sure if it really exists in the nature)
        Flock flockOfDucks = new Flock();
        IQuackable mallardDuck = duckFactory.createMallardDuck();
        IQuackable redheadDuck = duckFactory.createRedheadDuck();
        IQuackable duckCall    = duckFactory.createDuckCall();
        IQuackable rubberDuck  = duckFactory.createRubberDuck();

        IQuackable gooseDuck   = new GooseDuckAdapter(new Goose());


        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        // create a flock of mallard duck only that are a part of the larger flock of ducks
        Flock flockOfMallards = new Flock();
        IQuackable mallardOne = duckFactory.createMallardDuck();
        IQuackable mallardTwo = duckFactory.createMallardDuck();
        IQuackable mallardThree = duckFactory.createMallardDuck();
        IQuackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        // We add this flock to the larger flock
        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator:");

        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times.");
    }

    private void simulate(IQuackable duck) {
        duck.quack();
    }
}
