package com.luoqingshang.proxy.dynamic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		// TODO Auto-generated method stub
		//����Ŀ�����
		ITeacherDao target = new TeacherDao();

		//��Ŀ����󣬴����������, ����ת�� ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

		// proxyInstance=class com.sun.proxy.$Proxy0 �ڴ��ж�̬�����˴������
		System.out.println("proxyInstance=" + proxyInstance.getClass());

		//ͨ��������󣬵���Ŀ�����ķ���
		proxyInstance.teach();
		System.out.println("");

		proxyInstance.sayHello(" tom ");
	}

}
