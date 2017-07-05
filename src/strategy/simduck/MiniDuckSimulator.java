package strategy.simduck;

import strategy.simduck.behaviour.FlyRocketPowered;
import strategy.simduck.ducks.Duck;
import strategy.simduck.ducks.MallardDuck;
import strategy.simduck.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
