package com.nt.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnyMatch {
	public static void main(String[] args) {
		person p4=new person("naresh", 23);
		person p1=new person("nandhu", 19);
		person p2=new person("harsha", 3);
		person p3=new person("naresh", 20);
		List<person>list=new ArrayList<person>();
		boolean status= list.stream().anyMatch(e->e.name.equals("naresh"));
		System.out.println(status);
		boolean s2=list.stream().anyMatch(p->p.name.equals("harsha"));
		System.out.println(s2);
		boolean s3=list.stream().allMatch(p->p.name.equals("harsha"));
	   System.out.println(s3);
	   boolean s4=list.stream().noneMatch(e->e.name.equals("swamy"));
	   System.out.println(s4);
	  System.out.println("====================");
	  List<person>naresh=list.stream()
			  .filter(p->p.name.equals("naresh"))
			  .collect(Collectors.toList())
			  ;
	  naresh.forEach(i->System.out.println(i));
	  long n=list.stream().distinct().count();
	  System.out.println(n);
	
	  List<Object>list1=List.of(1,"d","c",1,"d");
	  long n1=list1.stream().distinct().count();
	  System.out.println(n1);
	  
	  Object[] arr=list1.stream()
			  .distinct()
			  .toArray();
	  System.out.println(arr);
	  
	  List<Object> ll=list1.stream().distinct().toList();
	  System.out.println(ll);
	  
	  boolean b=list1.stream().allMatch(ele->ele.equals("c"));
	  System.out.println(b);
	}

}
