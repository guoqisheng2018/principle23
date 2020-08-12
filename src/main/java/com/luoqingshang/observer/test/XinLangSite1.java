package com.luoqingshang.observer.test;


import java.util.Observable;
import java.util.Observer;

public class XinLangSite1 implements Observer {

	// 温度，气压，湿度
	private float temperature;
	private float pressure;


	// 显示
	public void display() {
		System.out.println("===新浪网站====");
		System.out.println("***新浪网站 气温 : " + temperature + "***");
		System.out.println("***新浪网站 气压: " + pressure + "***");

	}

	@Override
	public void update(Observable o, Object arg) {
		TianQi tianQi = (TianQi) arg;
		this.temperature=tianQi.getTemperatrue();
		this.pressure=tianQi.getPressure();
		display();
	}
}
