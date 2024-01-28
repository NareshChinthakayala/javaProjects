package com.nt.ExamplesOnStreams;

public class Employee {
    public Integer eid;
    public String ename;
    public String dept;
    public String gender;
    public String addr;
    public Double sal;
	public Employee(Integer eid, String ename, String dept, String gender, String addr, Double sal) {
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
