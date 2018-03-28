package com.yj.main;

import com.yj.singleton.DoubleLock;
import com.yj.singleton.Hungry;
import com.yj.singleton.Lazy;
import com.yj.singleton.Perfect;
import com.yj.singleton.SingletonEnum;
import com.yj.singleton.SyncLazy;

public class Main {
	public static void main(String[] args) {
		System.out.println(Hungry.getHungry());
		System.out.println(Lazy.getLazy());
		System.out.println(Perfect.getPerfect());
		System.out.println(SyncLazy.getSyncLazy());
		System.out.println(SingletonEnum.instance);
		System.out.println(DoubleLock.getDoubleLock());
	}
}
