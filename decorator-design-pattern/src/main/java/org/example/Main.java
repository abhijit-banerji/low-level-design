package org.example;

public class Main {
    public static void main(String[] args) {
        //BasePizza extraCheesePizza = new ExtraCheese(new Margarita());
        BasePizza mushroomPizza = new Mushroom(new ExtraCheese(new Margarita()));
        System.out.println("Total Cost of the Pizza : " + mushroomPizza.cost());
    }
}