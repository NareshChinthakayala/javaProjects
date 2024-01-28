package com.nt.Java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample1 {
	public static void main(String[] args) {
		Function<String,Integer>f=(s)->s.length();
		System.out.println(f.apply("naresh"));
		BiFunction<Integer, Integer, Integer> bf=(a,b)->a+b;
		System.out.println(bf.apply(7, 90));
		
	}

}
