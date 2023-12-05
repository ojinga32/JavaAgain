package com.in28minutes.firstjavaproject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("hello");
		arrayList.add(" world");
		List<String> linkedList = new LinkedList<>();
		linkedList.add("add");
		linkedList.add("remove");
		
		System.out.println(arrayList);
		System.out.println(linkedList);

	}

}
