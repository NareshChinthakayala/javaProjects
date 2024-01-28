package com.nt.Java8;
interface I11{
	void m3();
}

public class InstanceMethodRef {
	public void m1() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("hjk");
	InstanceMethodRef im=new InstanceMethodRef();
		
		I11 i=im::m1;
		i.m3();
	}

}
