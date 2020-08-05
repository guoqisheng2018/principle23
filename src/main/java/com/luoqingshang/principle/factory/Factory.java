package com.luoqingshang.principle.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Factory {

    public List<Pizza> getPizza( List<String> list) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        List<Pizza> piozzas=new ArrayList<>();
        for (String classpath : list) {
            Class<?> aClass = Class.forName(classpath);
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
            Pizza pizza = (Pizza)declaredConstructor.newInstance();
            piozzas.add(pizza);
        }
        return piozzas;

    }
}
