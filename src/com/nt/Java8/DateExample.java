package com.nt.Java8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat sd=new SimpleDateFormat("dd/MMMM/yy");
		System.out.println(sd.format(d));
		System.out.println();
		//Date date=sd.parse("");
		SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
	//	Date parseDate=sd1.parse("");
		LocalDate ld=LocalDate.of(2022, 06, 15);
		System.out.println(ld);
		boolean ly=LocalDate.parse("2022-12-15").isLeapYear();
		System.out.println(ly);
	}

}
