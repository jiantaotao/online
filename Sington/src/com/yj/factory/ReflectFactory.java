package com.yj.factory;

import com.yj.factory.bean.Car;

//利用反射实现工厂
public class ReflectFactory {
	
	public static final String BM = "宝马";
	public static final String BC = "奔驰";
	
	
	@SuppressWarnings("unchecked")
	public static <T extends Car> T createCar(Class<T> car) {
		T result = null;
		try {
			result = (T) Class.forName(car.getName()).newInstance();//不适用于有参构造器对象的实例化
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
}
