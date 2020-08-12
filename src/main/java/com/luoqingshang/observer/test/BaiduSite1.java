package com.luoqingshang.observer.test;


import com.luoqingshang.observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class BaiduSite1 implements Observer {

	// �¶ȣ���ѹ��ʪ��
	private float temperature;
	private float pressure;
	private float humidity;

	// ��ʾ
	public void display() {
		System.out.println("===�ٶ���վ====");
		System.out.println("***�ٶ���վ ���� : " + temperature + "***");
		System.out.println("***�ٶ���վ ��ѹ: " + pressure + "***");
		System.out.println("***�ٶ���վ ʪ��: " + humidity + "***");
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
