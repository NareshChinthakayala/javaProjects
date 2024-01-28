package com.nt.Java8;

public class ThreadDemo2 {
	public static void main(String[] args) {
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<=5;i++) {
					System.out.println(i);
				}
			}
		};
		Thread t=new Thread(r);
		t.start();
	}

}
