package com.yj.factory.bean;

public abstract class Car {
	
	public String title;
	public String color;
	public String type;
	public String speed;
	public String point;
	public String provider;
	
	public Car() {
		super();
	}
	
	public abstract void move();
}
