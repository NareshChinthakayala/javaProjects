package com.nt.java8More;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateFunctions {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		System.out.println(d);
		//converting date to String
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		String s=sd.format(d);
		System.out.println(s);
		//converting String date
		SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=sd1.parse("2022-09-06");
		System.out.println(d1);
		LocalDate ld=LocalDate.now();
                      
		
		System.out.println(ld.plusDays(34));
		
	}

}
