package com.hbaltz.example;

import com.hbaltz.example.animal.bird.IQuackable;
import com.hbaltz.example.animal.bird.duck.*;
import com.hbaltz.example.animal.bird.duck.quack_counter.QuackCounter;
import com.hbaltz.example.animal.bird.goose.Goose;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.launchSimulation();
    }

    private void launchSimulation() {
        // Quack counter is a decorator that counts the number of quacks of the decorated ducks
        IQuackable mallardDuck = new QuackCounter(new MallardDuck());
        IQuackable redheadDuck = new QuackCounter(new RedheadDuck());
        IQuackable duckCall    = new QuackCounter(new DuckCall());
        IQuackable rubberDuck  = new QuackCounter(new RubberDuck());
        // We are not interested in the honk of the goose so we don't decorated the goose duck adapter
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
