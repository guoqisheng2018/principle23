package com.luoqingshang.principle.singleton;

public class SingletonTest03 {
    public static void main(String[] args) { //测试
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }
}

//使用枚举，可以实现单例, 推荐
enum Singleton {
    INSTANCE; //属性

    public void sayOK() {
        System.out.println("ok~");
    }
}