package com.nt.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindVowel {
	public static void main(String[] args) {
		String s="knowledge";
		String[] str=s.split("");
		
		for(int i=0;i<str.length;i++) {
			if(str[i].equalsIgnoreCase("o")||
			str[i].equalsIgnoreCase("a")||
			str[i].equalsIgnoreCase("e")||
			str[i].equalsIgnoreCase("i")||
			str[i].equalsIgnoreCase("u")){
		
				
			}else {
				System.out.print(str[i]);
			}
		}
	}
}
