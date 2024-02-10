package com.nt.demo;

import java.util.Scanner;

public class Arrays1 {
	public static void main(String[] args) {
		int n[]= {1,3,4,5};
		int n1[]=new int[5];
		Scanner scn=new Scanner(System.in);
		
		for(int i=0;i<n.length;i++) {
			n1[i]=n[i];
			if(n1[i]==1) {
				n1[i]=2;
			}
			System.out.println(n1[i]);
	}
		
	}
	void meth1() {
		System.out.println("meth 1 addedd");
	}
    void meth2() {
    	System.out.println("meth2 added");
    }
    void meth3()
    {
    	System.out.println("meth3 added");
    }
}
