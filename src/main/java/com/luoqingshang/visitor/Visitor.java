package com.luoqingshang.visitor;

public interface Visitor {

    // ���ʹ���ʦ����
    void visit(Engineer engineer);

    // ���ʾ�������
    void visit(Manager manager);
}
