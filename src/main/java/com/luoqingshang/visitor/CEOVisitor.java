package com.luoqingshang.visitor;

// CEO������
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("����ʦ: " + engineer.name + ", KPI: " + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("����: " + manager.name + ", KPI: " + manager.kpi +
                ", �²�Ʒ����: " + manager.getProducts());
    }
}
