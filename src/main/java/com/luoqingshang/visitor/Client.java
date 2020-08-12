package com.luoqingshang.visitor;

public class Client {

    public static void main(String[] args) {
        // ��������
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO������ ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO������ ===========");
        report.showReport(new CTOVisitor());
    }
}
