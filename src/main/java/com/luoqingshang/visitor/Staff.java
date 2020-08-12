package com.luoqingshang.visitor;

import java.util.Random;

// Ա������
public abstract class Staff {

    public String name;
    public int kpi;// Ա��KPI

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }
    // ���ķ���������Visitor�ķ���
    public abstract void accept(Visitor visitor);
}
