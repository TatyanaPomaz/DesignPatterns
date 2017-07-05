package strategy.simduck.ducks;

import strategy.simduck.behaviour.FlyNoWay;
import strategy.simduck.behaviour.Quack;

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
