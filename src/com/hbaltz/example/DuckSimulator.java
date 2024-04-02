package com.hbaltz.example;

import com.hbaltz.example.animal.bird.IQuackable;
import com.hbaltz.example.animal.bird.duck.*;
import com.hbaltz.example.animal.bird.goose.Goose;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.launchSimulation();
    }

    private void launchSimulation() {
        IQuackable mallardDuck = new MallardDuck();
        IQuackable redheadDuck = new RedheadDuck();
        IQuackable duckCall = new DuckCall();
        IQuackable rubberDuck = new RubberDuck();
        IQuackable gooseDuck = new GooseDuckAdapter(new Goose());

        System.out.println("\nDuck Simulator:");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    private void simulate(IQuackable duck) {
        duck.quack();
    }
}
