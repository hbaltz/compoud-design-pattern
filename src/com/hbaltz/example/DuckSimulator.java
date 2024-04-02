package com.hbaltz.example;

import com.hbaltz.example.animal.bird.IQuackable;
import com.hbaltz.example.animal.bird.duck.*;
import com.hbaltz.example.animal.bird.duck.duck_factory.AbstractDuckFactory;
import com.hbaltz.example.animal.bird.duck.duck_factory.CountingDuckFactory;
import com.hbaltz.example.animal.bird.duck.quack_counter.QuackCounter;
import com.hbaltz.example.animal.bird.goose.Goose;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        // We use here the counting duck factory, because we want the quack to be counted for each duck we are creating
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        duckSimulator.launchSimulation(countingDuckFactory);
    }

    private void launchSimulation(AbstractDuckFactory duckFactory) {
        IQuackable mallardDuck = duckFactory.createMallardDuck();
        IQuackable redheadDuck = duckFactory.createRedheadDuck();
        IQuackable duckCall    = duckFactory.createDuckCall();
        IQuackable rubberDuck  = duckFactory.createRubberDuck();

        IQuackable gooseDuck   = new GooseDuckAdapter(new Goose());

        System.out.println("\nDuck Simulator:");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times.");
    }

    private void simulate(IQuackable duck) {
        duck.quack();
    }
}
