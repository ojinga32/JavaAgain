package com.in28minutes.firstjavaproject;

import java.util.Arrays;

public class Person {

	private  String name;
	private  int[] marks;

	public Person(String name, int... marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
	
	
	
}
