package com.in28minutes.firstjavaproject;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {

	private static List<Integer> result1(List<Integer> list) {
		return list.stream().filter(e -> e%2 == 0).map(e -> e * e).collect(Collectors.toList());
	}
	
	
	private static int result() {
		return IntStream.range(0, 11).reduce(0, (num1, num2) -> {
			return num1 + num2;
		});
	}
	
	private static int result2() {
		return IntStream.range(0, 11).reduce(0, (num1, num2) -> {
			return num1 + num2;
		});
	}
	
	private static Optional<Integer> result3(List<Integer> list) {
		return list.stream().max((num1, num2) -> Integer.compare(num1, num2));
	}
	
	private static int result4(List<Integer> list) {
		return list.stream().max((num1, num2) -> Integer.compare(num1, num2)).map(a -> a * 2).get();
	}
	
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 23, 254, 4, 43, 233, 96);
		
		
		
		

		
		
		
		
		
		
		
		System.out.println(result1(list));
		System.out.println(result2());
		System.out.println(result3(list).get());
		System.out.println(result4(list));
		
		
		
		
	}

}
