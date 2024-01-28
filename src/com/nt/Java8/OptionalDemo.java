package com.nt.Java8;

import java.util.Optional;

class Ex{
	/*String m1(int id) {
		if(id==100) {
			return "naresh";
		}else {
			return null;
		}
	}*/
	Optional<String> m1(int id) {
		String name=null;
		if(id==100) {
			name= "naresh";
		}else if(id==200){
			name= "nandhu";
		}
		return Optional.ofNullable(name);
	}
}
public class OptionalDemo {
	public static void main(String[] args) {
		Ex e=new Ex();
		Optional<String> res=e.m1(100);
		if(res.isPresent()) {
			String s=res.get();
			System.out.println(s.toLowerCase()+" hello");
		}else {
			System.out.println("no data");
			
		}
	}
	

}
