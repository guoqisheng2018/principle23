package com.luoqingshang.prototype.test;

import com.luoqingshang.prototype.bean.Model;
import com.luoqingshang.prototype.bean.ModelThorough;
import com.luoqingshang.prototype.bean.ModelThorough2;

//原型模式
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        test03();
    }

    public static void test01() throws CloneNotSupportedException {
        Model model=new Model("模版名","模版类型");

        Model model1 = model.clone();

        Model model2 = model.clone();

        System.out.println(model);
        System.out.println(model.hashCode());

        System.out.println(model1);
        System.out.println(model1.hashCode());

        System.out.println(model2);
        System.out.println(model2.hashCode());
    }

    public static void test02() throws CloneNotSupportedException {
        ModelThorough modelThorough=new ModelThorough("深拷贝名","深拷贝类型",new Model("模版名","模版类型"));

        ModelThorough clone1 = modelThorough.clone();

        ModelThorough clone2 = modelThorough.clone();

        System.out.println(modelThorough);
        System.out.println(modelThorough.hashCode());
        System.out.println(modelThorough.getModel());
        System.out.println(modelThorough.getModel().hashCode());

        System.out.println("---------------------------------------------------------");

        System.out.println(clone1);
        System.out.println(clone1.hashCode());
        System.out.println(clone1.getModel());
        System.out.println(clone1.getModel().hashCode());

        System.out.println("---------------------------------------------------------");

        System.out.println(clone2);
        System.out.println(clone2.hashCode());
        System.out.println(clone2.getModel());
        System.out.println(clone2.getModel().hashCode());

    }

    public static void test03() throws CloneNotSupportedException {
        ModelThorough2 modelThorough2=new ModelThorough2("深拷贝名","深拷贝类型",new Model("模版名","模版类型"));

        ModelThorough2 clone1 = modelThorough2.clone();

        ModelThorough2 clone2 = modelThorough2.clone();

        System.out.println(modelThorough2);
        System.out.println(modelThorough2.hashCode());
        System.out.println(modelThorough2.getModel());
        System.out.println(modelThorough2.getModel().hashCode());

        System.out.println("---------------------------------------------------------");


        System.out.println(clone1);
        System.out.println(clone1.hashCode());
        System.out.println(clone1.getModel());
        System.out.println(clone1.getModel().hashCode());

        System.out.println("---------------------------------------------------------");

        System.out.println(clone2);
        System.out.println(clone2.hashCode());
        System.out.println(clone2.getModel());
        System.out.println(clone2.getModel().hashCode());

    }


}
