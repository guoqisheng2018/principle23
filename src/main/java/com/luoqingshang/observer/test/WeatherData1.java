package com.luoqingshang.observer.test;

import com.luoqingshang.observer.improve.Observer;
import com.luoqingshang.observer.improve.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * 类是核心
 * 1. 包含最新的天气情况信息 
 * 2. 含有 观察者集合，使用ArrayList管理
 * 3. 当数据有更新时，就主动的调用   ArrayList, 通知所有的（接入方）就看到最新的信息
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
		//调用 接入方的 update
		setChanged();
		notifyObservers(tianQi);
	}

	//当数据有更新时，就调用 setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperatrue = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//调用dataChange， 将最新的信息 推送给 接入方 currentConditions
		tianQi=new TianQi(temperatrue,pressure,humidity);
		dataChange();
	}




}
