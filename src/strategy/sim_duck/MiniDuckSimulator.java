package strategy.sim_duck;

import strategy.sim_duck.behaviour.FlyRocketPowered;
import strategy.sim_duck.ducks.Duck;
import strategy.sim_duck.ducks.MallardDuck;
import strategy.sim_duck.ducks.ModelDuck;

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
