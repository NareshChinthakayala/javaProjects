package com.nt.Java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SorttingAnArrayList {
	public static void main(String[] args) {
		ArrayList<Object>al=new ArrayList<Object>();
		al.add(5);
		al.add(1);
		al.add(2);
		al.add(9);
		al.add(3);
		System.out.println(al);
   //   Collections.sort(al,new NumberComparator());
		NumberComparator nc=new NumberComparator();
		//Collections.sort(al, nc);
		}

}
