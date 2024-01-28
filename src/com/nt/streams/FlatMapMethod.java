package com.nt.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapMethod {
public static void main(String[] args) {
	List<String>javaCourse=Arrays.asList("cj","cj","adv java","spring boot");
	List<String> uiCourse=Arrays.asList("html","css","bs","js");
	List<List<String>>allCourses=Arrays.asList(javaCourse,uiCourse);
	allCourses.stream().forEach(e->System.out.println(e));
	System.out.println("-------------------");
	allCourses.stream().flatMap(s->s.stream())
	.forEach(c->System.out.println(c));
	System.out.println("----------------");
	javaCourse.stream()
	.limit(2)
	.forEach(e->System.out.println(e));
	javaCourse.stream()
	.skip(2)
	.forEach(e->System.out.println(e));
	System.out.println("0000000000000000000000");
	javaCourse.stream()
	.distinct()
	.forEach(e->System.out.println(e));
}
}
