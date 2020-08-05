package com.luoqingshang.principle.factory;

public class CPizza extends Pizza implements CreatePizza{

    public CPizza() {
        setName("CPizza");
    }

    @Override
    public void cut() {
        System.out.println("c cut");
    }


    @Override
    public Pizza createPizza() {
        return new CPizza();
    }
}
