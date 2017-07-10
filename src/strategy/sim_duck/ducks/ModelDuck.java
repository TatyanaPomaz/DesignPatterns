package strategy.sim_duck.ducks;

import strategy.sim_duck.behaviour.FlyNoWay;
import strategy.sim_duck.behaviour.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model Duck!");
    }
}
