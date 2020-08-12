package com.luoqingshang.observer.test;


import com.luoqingshang.observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class BaiduSite1 implements Observer {

	// 温度，气压，湿度
	private float temperature;
	private float pressure;
	private float humidity;

	// 显示
	public void display() {
		System.out.println("===百度网站====");
		System.out.println("***百度网站 气温 : " + temperature + "***");
		System.out.println("***百度网站 气压: " + pressure + "***");
		System.out.println("***百度网站 湿度: " + humidity + "***");
	}

	@Override
	public void update(Observable o, Object arg) {
		WeatherData1 w = (WeatherData1) o;
		this.temperature=w.getTemperature();
		this.pressure=w.getPressure();
		this.humidity=w.getHumidity();
		display();
	}
}
