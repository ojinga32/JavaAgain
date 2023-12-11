package com.in28minutes.firstjavaproject;

import java.util.Objects;
import java.util.function.Function;


public class FunctionStudy {
	/*
	한 개의 매개변수를 전달받아 특정 작업을 수행 후 새로운 값을 반환하는 경우 사용됩니다.
	 
	제네릭 타입인 한 개의 인수가 존재하며, 제네릭 타입을 반환합니다.
	Function 인터페이스는 두 개의 제네릭 타입을 사용합니다.
	T: 첫 번째 매개변수의 타입입니다.
	R: 반환 타입입니다.
	*/
	
	public static void main(String args[]) {
		  Function<Integer, String> functionAdd =
		          (num) -> Integer.toString(num + 100);

		  Function<Integer, String> functionMinus =
		          (num) -> Integer.toString(num - 100);

		  Function<Integer, String> functionMultiple =
		          (num) -> Integer.toString(num * 100);

		  System.out.println("50 + 100 = " + functionAdd.apply(50));
		  System.out.println("50 - 100 = " + functionMinus.apply(50));
		  System.out.println("50 * 100 = " + functionMultiple.apply(50));
		
		  /*
		   	compose() 메서드의 매개변수는 Function 타입의 객체를 전달받습니다.
		   	※ 주의사항
		   	아래에서 소개할 andThen() 메서드와 달리 compose() 메서드에 람다 표현식을 전달할 수 없습니다.
			compose() 메서드는 매개변수로 전달받은 Function 객체의 apply() 메서드를 호출 후 반환 결과를 apply() 메서드에 전달합니다.
			 
			다음 예제는 compose() 메서드 반환 결과를 apply() 메서드에 전달합니다.
		  */
		  Function<Integer, Integer> functionAdd =
		          (num) -> num + 100;

		  Function <Integer, Integer> functionMultiple =
		          (num) -> num * 10;

		  System.out.println("(50 * 100) + 10 = " +
		          functionAdd.compose(functionMultiple).apply(50));
		  /*
			  andThen() 메서드의 매개변수는 Function 타입의 객체를 전달받거나 한 개의 매개변수를 가지며, 반환 타입이 존재하는 람다 표현식을 전달받습니다.
				 
			  andThen() 메서드는 apply() 메서드 호출 후 반환 결과를 매개변수로 전달받은 Function 객체의 apply() 메서드에 전달합니다.
					   
		   		Function<Integer, Integer> functionAdd =
		          (num) -> num + 100;
			
			  Function <Integer, Integer> functionMultiple =
			          (num) -> num * 10;
			
			  System.out.println("(50 + 100) * 10 = " +
		          functionAdd.andThen(functionMultiple).apply(50));
				   
				   	
		  */
	
	
	}
	
		

}
