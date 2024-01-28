package com.nt.streams;

import java.util.ArrayList;
import java.util.List;

class Emp1 {
	String name;

	public Emp1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}
	

}
 public class Emp{
	 public static void main(String[] args) {
		Emp1 e=new Emp1("nresh");
		List list=new ArrayList<Object>();
		list.add(new Emp1("df"));
		
	}
	 
 }
