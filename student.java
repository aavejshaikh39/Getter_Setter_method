package com.aavej_12182;

public class student 
{
	int roll;
	String name,addr;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
}
