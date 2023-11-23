package com.in28minutes.firstjavaproject;

public class Car {

	// 프로그래머로서 일을 시작한지 2개월이지만 기초가 많이 부족한것 같다.
	private int speed;
	private int power;
	
	public Car(int speed) {
		this.speed = speed;
	}
	
	public Car(int speed ,int power) {
		this.speed = speed;
		this.power = power;
		
	}
	
	public int setSpeed(int speed) {
		return this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", power=" + power + "]";
	}
	
	
	
	
	
}
