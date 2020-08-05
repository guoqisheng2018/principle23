package com.luoqingshang.builder.director;


import com.luoqingshang.builder.builder.DaZhongBuilder;
import com.luoqingshang.builder.product.Car.Car;

public class DaZhongDirector{
    private DaZhongBuilder daZhongBuilder;

    public DaZhongDirector(DaZhongBuilder daZhongBuilder) {
        this.daZhongBuilder = daZhongBuilder;
    }

    public void setDaZhongBuilder(DaZhongBuilder daZhongBuilder) {
        this.daZhongBuilder = daZhongBuilder;
    }


    public Car constructCar() {
        daZhongBuilder.addEngine();
        daZhongBuilder.addFrame();
        daZhongBuilder.addTrpe();
        daZhongBuilder.addUmbrella();
        return daZhongBuilder.buildCar();
    }
}
