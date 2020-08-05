package com.luoqingshang.builder.builder;

import com.luoqingshang.builder.product.Car.Car;
import com.luoqingshang.builder.product.Car.DaZhongCar;


public class DaZhongBuilder implements CarBuilder{
    private DaZhongCar daZhongCar=new DaZhongCar();

    @Override
    public void addEngine() {
        System.out.println("安装大众发动机");

    }

    @Override
    public void addFrame() {
        System.out.println("安装大众车架");
    }

    @Override
    public void addTrpe() {
        System.out.println("安装大众轮胎");
    }

    public void addUmbrella(){
        System.out.println("安装大众雨伞");
    }

    public Car buildCar(){
        return daZhongCar;
    }
}
