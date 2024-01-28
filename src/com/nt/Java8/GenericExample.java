package com.nt.Java8;

class generic<Integer,String>{
	 void m1(Integer t) {
		
		System.out.println(t);
	}
	 void m2(Integer i,String s) {
		 System.out.println(i+" "+s);
	 }
}
public class GenericExample {
	public static void main(String[] args) {
		generic g=new generic();
		g.m1(6);
		g.m1("naresh");
		g.m1(8.0);
		g.m1(true);
		g.m2("naresh", 6);
	}

}
