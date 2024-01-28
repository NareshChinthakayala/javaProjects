package com.nt.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {
	public static void main(String[] args) {
	//	Consumer<String> c=()->System.out.println(e+" good nt");
	
	 //  c.accept("naresh");
	   List<Object>l=new ArrayList<Object>();
	   l.add(5);
	   l.add("dg");
	   l.forEach(e->System.out.println(e));
	  
	}

}
