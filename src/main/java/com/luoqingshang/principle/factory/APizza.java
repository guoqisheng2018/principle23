package com.luoqingshang.principle.factory;

public class APizza extends Pizza implements CreatePizza{

    public APizza() {
        setName("aPizza");
    }

    @Override
    public void cut() {
        System.out.println("aPizza");
    }


    @Override
    public Pizza createPizza() {
        return new APizza();
    }
}
