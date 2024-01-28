package com.nt.streams;

import java.util.Arrays;
import java.util.List;

class person{
	String name;
	int age;

person(String name,int age){
	this.age=age;
	this.name=name;
}
public String toString() {
	return "name ="+this.name+" , age ="+this.age;
	
}
public person length() {
	// TODO Auto-generated method stub
	return null;
}
}

public class S3 {
	public static void main(String[] args) {
	person p=new person("naresh", 23);
	person p1=new person("nandhu", 17);
	person p2=new person("harsha", 20);
	List<person> list=Arrays.asList(p,p1,p2);
	list.stream()
	.filter(e->e.name.startsWith("n"))
	.filter(age->age.age>=18)
	.forEach(i->System.out.println(i));
	System.out.println("==============");
	list.stream()
	.map(e->e.name.toUpperCase())
	.forEach(e->System.out.println(e));
	list.stream()
	.mapToInt(e->e.name.length())
    .forEach(e->System.out.println(e));
	System.out.println("--------------------");
	list.stream()
	.filter(e->e.name.startsWith("n"))
	.map(i->i.name +" "+i.name.length())
	.forEach(e->System.out.println(e));
	
	}

}
