package com.nt.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;
interface I1{
	void m1();
}
class classB{
	public void m4() {
		System.out.println("classB.m4()");
	}
}


public class MethodRef {
	public static void m2() {
		System.out.println("MethodRef.m2()");
	}
	public static void main(String[] args) {
		
		//Consumer<String>c=(msg)->System.out.println(msg);
	//c.accept("hi");
		I1 i=MethodRef::m2;
		i.m1();
		//ClassB b=new classB();
	//	I1 i1=b
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(9);
		al.add(7);
		al.add(4);
		TreeSet<Integer>ts=new TreeSet<Integer>();
		for(Integer al2:al) {
			ts.add(al2);
		}
		System.out.println(ts);
	
	}

}

