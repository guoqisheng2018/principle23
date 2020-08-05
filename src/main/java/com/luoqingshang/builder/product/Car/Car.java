package com.luoqingshang.builder.product.Car;

import com.luoqingshang.builder.product.engine.Engine;
import com.luoqingshang.builder.product.frame.Frame;
import com.luoqingshang.builder.product.trpe.Trpe;
import lombok.Data;

@Data
public class Car {
    private Frame frame;

    private Trpe tyre;

    private Engine engine;

}