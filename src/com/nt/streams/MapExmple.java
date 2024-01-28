package com.nt.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class emp{
	int age;
	String name;
	double salary;
	public emp(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "emp [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class MapExmple {
	public static void main(String[] args) {
		emp e=new emp(10, "naresh",400);
		emp e1=new emp(3, "narsha",600);
		emp e2=new emp(30, "rishi",500);
		emp e3=new emp(30, "swamy",300);
		List<emp>list=List.of(e,e1,e2,e3);
	    list.stream()
	    .filter(p -> p.name.startsWith("n"))
		 .collect(Collectors.toList())
		 .forEach(n->System.out.println(n));
		
	    //list.forEach(h->System.out.println(h));
		System.out.println("----------------------");
	Optional<emp>collect=	list.stream()
		.collect(Collectors.maxBy(Comparator.comparingDouble(s->s.salary)));
		
		System.out.println(collect);
		
System.out.println("-----------------");

        Double d=list.stream()
         .collect(Collectors.averagingDouble(s->s.salary));
		System.out.println(d);
		
		Long n=list.stream()
		.collect(Collectors.counting());
		System.out.println(n);
		Map<Object,List<emp>>data
		=list.stream()
		.collect(Collectors.groupingBy(e7->e7.name.equals(n)));
        System.out.println(data);
	}

}
