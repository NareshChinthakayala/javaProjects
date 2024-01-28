package com.nt.Java8;

import java.util.function.BiFunction;
interface I2{
	int  m1(int a,int b);
}
interface I3{
	int m2(int a);
}
interface I4{
	void m3();
}
interface I5{
	void m();
}
class Arithmatic{
	Arithmatic(){
		
	}
	public Arithmatic(String msg) {
	System.out.println("con");
	}
	static int add(int a,int b) {
		return a+b;
	}
static	int sub(int a) {
		return a;
	}
void div() {
	System.out.println("divission");
}
}

public class MethodRef3 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>adder=(a,b)->a+b;
		System.out.println(adder.apply(10, 20));
System.out.println("===============");
BiFunction<Integer, Integer, Integer>adder1=Arithmatic::add;
System.out.println(adder1.apply(90, 10));

System.out.println("========================");
I2 i=(x,y)->x+y;
System.out.println(i.m1(2, 4));
I2 i1=Arithmatic::add;
System.out.println(i1.m1(8, 0));
I3 i3=Arithmatic::sub;
System.out.println(i3.m2(80));
I4 i4=new Arithmatic()::div;
i4.m3();
System.out.println("------------");
I5 i5=Arithmatic::new;

name nm=e->System.out.println(e);
        nm.msg("hk");
        name nm1=System.out::println;
        nm.msg("naresh");
        Addition  addition= (a,b)->{AA.m1(a, b);};
        addition.naresh(5, 7);
        Addition aa=AA::m1;
        aa.naresh(5, 9);
    //  AA a123=new AA();
     // disp d=()->a123.m2();
      //d.m5();
        
        //disp d=()->new AA().m2();
        //d.m5();
   //   disp d=a123::m2;
    //  d.m5();
        System.out.println("+++++++++++++");
        disp d=new AA()::m2;
        disp d1=new AA(5)::m2;
        System.out.println(d.m5(6));
       // disp d2=AA::new;
       
	}
	
	interface name{
		void msg(String name);
	}
	interface Addition{
		void naresh(int a,int g);
	}
	interface disp{
		int m5(int a);
	}
}
	class AA{
		AA(){
			System.out.println("AA.AA()");
		}
		AA(int a){
			System.out.println("AA con");
		}
		
		static void m1(int a,int b) {
			System.out.println(a+b);
		}
		int m2(int a) {
			System.out.println("hjkdslkfjd "+a);
			return a;
		}
	}

