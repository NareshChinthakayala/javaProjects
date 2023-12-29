package com.nt.demo;

import java.util.Arrays;

public class Array3 {
 public static void main(String[] args) {
	
	int[] n= {2,3,4,1,8,7};
 int[] n1= {5,6,7,1,4};
 int len=n.length+n1.length;
   int[] newArray=new int[len];
   
 System.arraycopy(n, 0, newArray,0,n.length);
 System.arraycopy(n1, 0, newArray,n.length,n1.length);
 for(Object o:newArray) {
	 System.out.print(o+"\s");
 }
 System.out.println("======================");
 for(int i=0;i<n.length;i++) {
	 for(int j=i+1;j<n1.length;j++) {
		 if(newArray[i]==newArray[j]) {
			 System.out.println(newArray[i]);
		 }
	 }
 }
}
}