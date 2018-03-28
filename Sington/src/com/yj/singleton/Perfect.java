package com.yj.singleton;

//单例模式-静态内部类写法，线程安全而且懒加载
public class Perfect {
	
	private Perfect() {
	}
	
	public static class InPerfect{
		private static Perfect perfect = new Perfect();
	}
	
	public static Perfect getPerfect() {
		return InPerfect.perfect;
	}
}
