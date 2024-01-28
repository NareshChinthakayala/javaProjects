package com.nt.Java8;

import java.util.Random;

public class OtpGeneration {
	public static void main(String[] args) {
		String otp="";
		for(int i=1;i<=5;i++) {
      otp=otp+(int)(Math.random()*10);			
		}
		System.out.println(otp);
	}

}
