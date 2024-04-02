package com.hbaltz.example;

import com.hbaltz.example.animal.bird.IQuackable;
import com.hbaltz.example.animal.bird.duck.DuckCall;
import com.hbaltz.example.animal.bird.duck.MallardDuck;
import com.hbaltz.example.animal.bird.duck.RedheadDuck;
import com.hbaltz.example.animal.bird.duck.RubberDuck;

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

        System.out.println("\nDuck Simulator:");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    private void simulate(IQuackable duck) {
        duck.quack();
    }
}
