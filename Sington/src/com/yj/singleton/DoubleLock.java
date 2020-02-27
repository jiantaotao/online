package com.yj.singleton;

//单例模式-双重检查锁
//线程安全且懒加载，推荐使用
public class DoubleLock {
	private static volatile DoubleLock doubleLock;
	
	private DoubleLock() {
	}
	
	public static DoubleLock getDoubleLock() {
		if (doubleLock == null) {
			synchronized (DoubleLock.class) {
				if (doubleLock == null) {
					doubleLock = new DoubleLock();
				}
			}
		}
		return doubleLock;
	}
}
