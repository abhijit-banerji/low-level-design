package org.example;

public class Mushroom extends ToppingDecorator{

    public BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 200;
    }
}
