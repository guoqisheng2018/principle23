package com.luoqingshang.observer.test;



public class Client {

	public static void main(String[] args) {
		WeatherData1 weatherData = new WeatherData1();
		BaiduSite1 baiduSite = new BaiduSite1();
		XinLangSite1 xinLangSite=new XinLangSite1();

		weatherData.addObserver(baiduSite);
		weatherData.addObserver(xinLangSite);

		weatherData.setData(30f,50f,100);
	}


}
