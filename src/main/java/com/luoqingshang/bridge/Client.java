package com.luoqingshang.bridge;

public class Client {

	public static void main(String[] args) {
		
		//��ȡ�۵�ʽ�ֻ� (��ʽ + Ʒ�� )
		
		Phone phone1 = new FoldedPhone(new XiaoMi());
		
		phone1.open();
		phone1.call();
		phone1.close();
		
		System.out.println("=======================");

		Phone phone2 = new FoldedPhone(new HuaWei());
		phone2.open();
		phone2.call();
		phone2.close();

	}

}
