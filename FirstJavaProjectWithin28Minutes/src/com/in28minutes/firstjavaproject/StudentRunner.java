package com.in28minutes.firstjavaproject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class ASCStudent implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}

public class StudentRunner {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(3, "mike"));
		list.add(new Student(2, "susan"));
		list.add(new Student(1, "tison"));
		
		list.sort(new ASCStudent());
		System.out.println(list);
		
		List<String> al1 = new ArrayList<>();
		al1.add("cat");
		al1.add("tiger");
		al1.add("snake");
		
		List<String> al2 = new ArrayList<>();
		al2.add("dog");
		al2.add("bat");
		
		al1.addAll(al2);
		
		
//		for(String al:al1) {
//			if(al.endsWith("at")) {
//				al1.remove(al);
//				break;
//			}
//		}
		
//		for(int i=0; i<al1.size(); i++) {
//			if(al1.get(i).endsWith("at")) {
//				al1.remove(i);
//			}
//		}
		
		Iterator<String> iteratorAl = al1.iterator(); 
		
		while(iteratorAl.hasNext()) {
			if(iteratorAl.next().endsWith("at")) {
				iteratorAl.remove();
			}
		}
		
		System.out.println("al1 = "+ al1);
		

		System.out.println("iteratorAl = "+ iteratorAl.toString());
		
		
		
		
	}

}
