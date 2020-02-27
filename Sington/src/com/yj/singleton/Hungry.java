package com.yj.singleton;

//单例模式-饿汉
//线程安全，但起不到懒加载的作用
public class Hungry {
	
	private static final Hungry hungry = new Hungry();
	
	private Hungry() {
		
	}
	
	public static Hungry getHungry() {
		return hungry;
	}
}
