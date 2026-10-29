package apresentacao;

import patos.Duck;
import patos.MallardDuck;
import voos.FlyNoWay;

public class MiniPatinhoNaLagoa {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        System.out.println("\n-- Mudando o comportamento de voo dinamicamente --");
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}