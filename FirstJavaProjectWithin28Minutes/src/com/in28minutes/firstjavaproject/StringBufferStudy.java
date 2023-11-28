package com.in28minutes.firstjavaproject;

public class StringBufferStudy {

	/*
	 String is a immutable
	 so it can be changed but it can not append any worlds behind of String
	 however there is a way to append
	 the way is to use StringApi 'StringBuffer'
	 
	 This is really useful api...
	 2023 November 28, i made a code which make a form of json with datas in JavaScript and it was really difficult
	 because there isn't StringBuffer in JS so instead of it, i used += and not only this one, also i used so many 'if'
	 today will be worth it, and im gonna laugh at me because i would think i was a cute when im a juinor developer.
	
	 Java에서 클래스 레벨에서 선언된 변수는 상수로 간주 
	 StringBuffer를 사용할 때, 코드는 메소드 내에서 또는 초기화 블록 내에서 실행되어야 한다
	*/
	
	public static void hello() {
		String string  = "hello";
		string = "it didnt work";
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" world5");
		sb.setCharAt(11, ' ');

		StringBuffer sb2 = new StringBuffer();
		sb2.append("newest");
		
		System.out.println(string);		// it didnt work
		System.out.println(sb);			// hello world
		System.out.println(sb2);		// newest
	}
	
	public static void main(String[] args) {
		hello();
	}
	
	
}
