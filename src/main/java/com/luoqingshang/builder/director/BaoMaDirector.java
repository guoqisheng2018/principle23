package com.luoqingshang.builder.director;

import com.luoqingshang.builder.builder.BaoMaBuilder;
import com.luoqingshang.builder.product.Car.Car;

public class BaoMaDirector{
    private BaoMaBuilder baoMaBuilder;

    public BaoMaDirector(BaoMaBuilder baoMaBuilder) {
        this.baoMaBuilder = baoMaBuilder;
    }

    public void setBaoMaBuilder(BaoMaBuilder baoMaBuilder) {
        this.baoMaBuilder = baoMaBuilder;
    }

    public Car constructCar() {
        baoMaBuilder.addEngine();
        baoMaBuilder.addFrame();
        baoMaBuilder.addTrpe();
        return baoMaBuilder.buildCar();
    }
}
