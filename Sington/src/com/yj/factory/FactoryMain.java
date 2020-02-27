package com.yj.factory;

import com.yj.factory.bean.Baoma;
import com.yj.factory.bean.Benchi;
import com.yj.factory.bean.Car;

public class FactoryMain {
	
	public static void main(String[] args) {
		Car baoma = SimpleFactory.createCar(SimpleFactory.BM);
		baoma.move();
		Car benchi = SimpleFactory.createCar(SimpleFactory.BC);
		benchi.move();
		
		Baoma baoma1 = ReflectFactory.createCar(Baoma.class);
		baoma1.title = ReflectFactory.BM;
		baoma1.move();
		Benchi benchi2 = ReflectFactory.createCar(Benchi.class);
		benchi2.title = ReflectFactory.BC;
		benchi2.move();
	}
}
