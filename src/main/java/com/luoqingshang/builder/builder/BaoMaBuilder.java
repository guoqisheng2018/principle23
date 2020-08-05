package com.luoqingshang.builder.builder;

import com.luoqingshang.builder.product.Car.BaoMaCar;
import com.luoqingshang.builder.product.Car.Car;
import com.luoqingshang.builder.product.engine.BaoMaEngine;
import com.luoqingshang.builder.product.frame.BaoMaFrame;
import com.luoqingshang.builder.product.trpe.BaoMaTrpe;

public class BaoMaBuilder implements CarBuilder{
    private BaoMaCar baoMaCar=new BaoMaCar();

    @Override
    public void addEngine() {
        System.out.println("安装宝马发动机");
        baoMaCar.setEngine(new BaoMaEngine());
    }

    @Override
    public void addFrame() {
        System.out.println("安装宝马车架");
        baoMaCar.setFrame(new BaoMaFrame());
    }

    @Override
    public void addTrpe() {
        System.out.println("安装宝马轮胎");
        baoMaCar.setTyre(new BaoMaTrpe());
    }

    public Car buildCar(){
        return baoMaCar;
    }
}
