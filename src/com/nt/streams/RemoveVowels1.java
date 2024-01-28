package com.nt.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveVowels1 {
	public static void main(String[] args) {
		
	
    String s="knowledge";
    String[] str=s.split("");
    List<String> list=List.of(str);
    
    list.stream()
    .filter(e->!"aeiouAEIOU".contains(e))
    .forEach(System.out::print);
    
   
	}
}