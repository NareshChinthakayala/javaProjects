package com.nt.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class S2 {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(55,66,77,88,44);
		list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));

		List<String>list1=Arrays.asList("anufsf","revanth","amma","raja");
		list1.stream()
		.filter(e->e.startsWith("a"))
		.forEach(e->System.out.println(e.length()));
	
	
	
	}

}
