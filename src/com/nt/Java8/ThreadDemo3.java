package com.nt.Java8;

public class ThreadDemo3 {
	public static void main(String[] args) {
		Runnable r=()->{
			System.out.println("hi");
		};
		Thread t=new Thread(r);
		t.start();
	}

}
