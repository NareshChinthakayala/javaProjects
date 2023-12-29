package com.nt.demo;

public class Array2 {
	public static void main(String[] args) {
	int [] n= {1,3,2,3,3,2};
	int res=Array2.isRepeaed(n);
	}
	public static int isRepeaed(int[] n2) {
		for(int i=0;i<n2.length;i++) {
			int count=0;
			for(int j=i+1;j<n2.length;j++) {
				if(n2[i]==n2[j]) {
					count ++;
				//n2[j]=' ';
				}
			}
			System.out.println(n2[i]+" "+count);
			
		}
		
		return 0;
	}

}
