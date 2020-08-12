package com.luoqingshang.observer.test;

import com.luoqingshang.observer.improve.Observer;
import com.luoqingshang.observer.improve.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * ���Ǻ���
 * 1. �������µ����������Ϣ 
 * 2. ���� �۲��߼��ϣ�ʹ��ArrayList����
 * 3. �������и���ʱ���������ĵ���   ArrayList, ֪ͨ���еģ����뷽���Ϳ������µ���Ϣ
 * @author Administrator
 *
 */
public class WeatherData1 extends Observable {
	private float temperatrue;
	private float pressure;
	private float humidity;

	private TianQi tianQi;

	public float getTemperature() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void dataChange() {
		//���� ���뷽�� update
		setChanged();
		notifyObservers(tianQi);
	}

	//�������и���ʱ���͵��� setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//����dataChange�� �����µ���Ϣ ���͸� ���뷽 currentConditions
		tianQi=new TianQi(temperatrue,pressure,humidity);
		dataChange();
	}




}
