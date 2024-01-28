package com.nt.ExamplesOnStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 class Employee1 {
    public Integer eid;
    public String ename;
    public String dept;
    public String gender;
    public String addr;
    public Double sal;
	public Employee1(Integer eid, String ename, String dept, String gender, String addr, Double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.gender = gender;
		this.addr = addr;
		this.sal = sal;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", gender=" + gender + ", addr=" + addr
				+ ", sal=" + sal + "]";
	}
}

public class EmpTest {
	public static void main(String[] args) {
		Employee1 e1=new Employee1(1, "naresh", "java dev","male", "hyd", 500000.0);
		Employee1 e2=new Employee1(2, "haraha", "student","male", "us", 700000.0);
		Employee1 e3=new Employee1(3, "swamy", "sr java dev","male", "kenada", 800000.0);
		Employee1 e4=new Employee1(4, "rishi", "doctor","male", "hyd", 5000000.0);
		Employee1 e5=new Employee1(5, "lakshman", "politician","male", "bpur", 1500000.0);
		Employee1 e6=new Employee1(6, "bhikshapathi", "farmer","male", "ap", 500000.0);
		Employee1 e7=new Employee1(7, "Laxmi", "village dev","female", "markook", 50000.0);
		Employee1 e8=new Employee1(8, "nandhini", "student","female", "gp", 100000.0);
		Employee1 e9=new Employee1(9, "varsha", "python dev","female", "rampally", 5054000.0);
		Employee1 e10=new Employee1(10, "nagesh", "farmer","male", "bpur", 505454.0);
		Employee1 e11=new Employee1(11, "rithika", "associate dev","female", "siddipet", 5000.0);
	Stream list=Stream.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
   //1. finding female and males
	Map<String, Long> map=(Map<String, Long>) list.collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
	System.out.println(map);
	//2. printing females and males
        list.map(n->n.d)
	
	
	}

}
