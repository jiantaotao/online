package com.yj.factory;

import com.yj.factory.bean.Baoma;
import com.yj.factory.bean.Benchi;
import com.yj.factory.bean.Car;

//简单工厂模式
public class SimpleFactory {
	
	public static final int BM = 1;
	public static final int BC = 2;
	
	public static Car createCar(int type) {
		switch (type) {
		case BM:
			Baoma baoma = new Baoma();
			baoma.title = "宝马";
			return baoma;
		case BC:
			Benchi benchi = new Benchi();
			benchi.title = "奔驰";
			return benchi;
		default:
			return null;
		}
	}
}
