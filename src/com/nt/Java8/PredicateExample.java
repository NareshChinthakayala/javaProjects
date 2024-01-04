package com.nt.Java8;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		
	Predicate<Integer> p1=(e)->(e%2)==0;
	p1.test(10);
	System.out.println(p1.test(9));

//	System.out.println(o.test("Anuksh"));
	String s[]= {"anu","bhaby","arya","naresh"};
	Predicate<String>o=e1->e1.charAt(0)=='a';
	for(String name:s) {
		if(o.test(name)) {
			System.out.println(name);
		}
	}
	}

}
