package com.oracle.test3;

public class Baby {
	
	public int age;
	public int sex;  //0:girl 1:boy
	
	public Baby(int age, int sex) {
		this.age = age;
		this.sex = sex;
	}
	
	public int hashCode() {
		return age + sex;
	}
	
	public boolean equals(Object o) {
		
		Baby b = (Baby)o;
		
		if(this.age != b.age) {
			return false;
		}
		
		if(this.sex != b.sex) {
			return false;
		}
		
		return true;
		
	}
	
}
