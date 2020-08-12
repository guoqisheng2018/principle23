package com.luoqingshang.visitor;

import java.util.Random;

// ����ʦ
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // ����ʦһ��Ĵ�������
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}