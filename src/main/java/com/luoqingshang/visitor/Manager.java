package com.luoqingshang.visitor;

import java.util.Random;

// ����
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // һ�����Ĳ�Ʒ����
    public int getProducts() {
        return new Random().nextInt(10);
    }
}