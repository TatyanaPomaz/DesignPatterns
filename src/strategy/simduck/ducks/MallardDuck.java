package strategy.simduck.ducks;

import strategy.simduck.behaviour.FlyWithWings;
import strategy.simduck.behaviour.Quack;

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
