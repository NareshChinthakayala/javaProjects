package com.nt.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class S1 {
	public static void main(String[] args) {
		Stream<Integer> s1=Stream.of(1,2,3,4);
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(3);
		ll.add(6);
		Stream<Integer>s2=ll.stream();
	}

}
