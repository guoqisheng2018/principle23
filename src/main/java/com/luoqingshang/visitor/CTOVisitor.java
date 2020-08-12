package com.luoqingshang.visitor;

public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("����ʦ: " + engineer.name + ", ��������: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("����: " + manager.name + ", ��Ʒ����: " + manager.getProducts());
    }
}
