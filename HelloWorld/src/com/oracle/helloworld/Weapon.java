package com.oracle.helloworld;

public class Weapon {
	private String name;
	private int attackPower;
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void attack() {
		System.out.println(this.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
