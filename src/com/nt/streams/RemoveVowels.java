package com.nt.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveVowels {
	public static void main(String[] args) {
		
	
    String s="knowledge";
    String res=m1(s);
    System.out.println(res);
	}
	private static String m1(String s2) {
		// TODO Auto-generated method stub
		return s2.chars()
				.mapToObj(c->(char)c)
				.filter(c->!"aeiou".contains(String.valueOf(c)))
				.map(String::valueOf)
				.collect(Collectors.joining()
						);
	}
}