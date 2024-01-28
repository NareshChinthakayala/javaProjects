package com.nt.Java8;

public class StringJoiner {
	public static void main(String[] args) {
		java.util.StringJoiner sj=new java.util.StringJoiner("-");
		sj.add("naresh");
		sj.add("nandhu");
		System.out.println(sj);
		java.util.StringJoiner sj1=new java.util.StringJoiner("-", "(", ")");
		sj1.add("naresh");
		sj1.add("nandhu");
		System.out.println(sj1);
		
	}

}
