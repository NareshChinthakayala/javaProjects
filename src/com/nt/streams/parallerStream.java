package com.nt.streams;

import java.util.stream.Stream;

public class parallerStream {
	public static void main(String[] args) {
		Stream<Integer>s=Stream.of(1,2,3,4,5);
		//s.forEach(System.out::println);
		//s.parallel()
		//.forEach(p->System.out.println(p));
		s.spliterator()
		
		.forEachRemaining(g->System.out.println(g));
	}

}
