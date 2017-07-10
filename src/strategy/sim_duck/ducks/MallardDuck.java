package strategy.sim_duck.ducks;

import strategy.sim_duck.behaviour.FlyWithWings;
import strategy.sim_duck.behaviour.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck!");
    }
}
