package com.luoqingshang.observer.test;


import java.util.Observable;
import java.util.Observer;

public class XinLangSite1 implements Observer {

	// �¶ȣ���ѹ��ʪ��
	private float temperature;
	private float pressure;


	// ��ʾ
	public void display() {
		System.out.println("===������վ====");
		System.out.println("***������վ ���� : " + temperature + "***");
		System.out.println("***������վ ��ѹ: " + pressure + "***");

	}

	@Override
	public void update(Observable o, Object arg) {
		TianQi tianQi = (TianQi) arg;
		this.temperature=tianQi.getTemperatrue();
		this.pressure=tianQi.getPressure();
		display();
	}
}
