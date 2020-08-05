package com.luoqingshang.flyweight;

import java.util.HashMap;

// ��վ�����࣬������Ҫ����ѹһ����վ
public class WebSiteFactory {

	
	//���ϣ� �䵱�ص�����
	private HashMap<String, WebSite> pool = new HashMap<>();
	
	//������վ�����ͣ�����һ����վ, ���û�оʹ���һ����վ�������뵽����,������
	public WebSite getWebSiteCategory(String type) {
		if(!pool.containsKey(type)) {
			//�ʹ���һ����վ�������뵽����
			pool.put(type, new ConcreteWebSite(type));
		}
		
		return pool.get(type);
	}
	
	//��ȡ��վ��������� (�����ж��ٸ���վ����)
	public int getWebSiteCount() {
		return pool.size();
	}
}
