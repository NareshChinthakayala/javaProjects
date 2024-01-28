package com.nt.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class person{
	private String name;
	private int age ;
	private String loc;
	public person(String name, int age,String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc=loc;
	}
	
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", loc=" + loc + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	
}
public class PredicateExample2 {
	public static void main(String[] args) {
		
	
	person p1=new person("naresh", 23,"hyd");
	person p2=new person("nandhu", 19,"ap");
	person p3=new person("harsha", 3,"gajwel");
	person p4=new person("swamy", 20,"hyd");
	person p5=new person("rishi", 01,"delhi");
	List<person> per=Arrays.asList(p1,p2,p3,p4,p5);
	Predicate<person>predicate=s->s.getAge()>=18 &&s.getName().startsWith("n") && s.getLoc().equalsIgnoreCase("hyd") ;
	for(person pp:per) {
		if(predicate.test(pp)) {
			System.out.println(pp);
		}
	}
	System.out.println("=============");
	Predicate<person>pp1=e->e.getAge()>18;
	Predicate<person>pp2=e1->e1.getLoc().equalsIgnoreCase("hyd");
	Predicate<person>pp3=pp1.or(pp2);
	for(person pp:per) {
		if(pp3.test(pp)) {
			System.out.println(pp);
		}
	}
	System.out.println("======Function=======");
	//.Function<person, person>pp5=e->e.getAge();
	     
	}
}
