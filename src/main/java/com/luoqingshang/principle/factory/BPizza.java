package com.luoqingshang.principle.factory;

public class BPizza extends Pizza implements CreatePizza{

    public BPizza() {
        setName("BPizza");
    }

    @Override
    public void cut() {
        System.out.println("b cut");
    }


    @Override
    public Pizza createPizza() {
        return new BPizza();
    }
}
