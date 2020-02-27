package com.yj.singleton;

//单例模式-懒加载
//懒加载但线程不安全
public class Lazy {
	
	private static Lazy lazy;
	
	private Lazy() {
		
	}
	
	public static Lazy getLazy() {
		if(lazy == null) {
			lazy = new Lazy();
		}
		return lazy; 
	}
}
