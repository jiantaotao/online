package com.yj.singleton;

//单例模式-同步懒加载
//线程安全，但同步方法效率稍低
public class SyncLazy {
	private static SyncLazy syncLazy;
	
	private SyncLazy() {
	}
	
	public static synchronized SyncLazy getSyncLazy() {
		if(syncLazy == null) {
			syncLazy = new SyncLazy();
		}
		return syncLazy;
	}
}
