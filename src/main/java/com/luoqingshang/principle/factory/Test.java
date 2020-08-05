package com.luoqingshang.principle.factory;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<String> list= Arrays.asList("com.luoqingshang.principle.factory.APizza","com.luoqingshang.principle.factory.BPizza");
        List<Pizza> pizzas = new Factory().getPizza(list);
        for (Pizza pizza : pizzas) {
            pizza.cut();
            System.out.println(pizza);
        }
    }
}
