package com.oracle.helloworld;

public class StormThor extends Magic{
	public StormThor() {
		// TODO Auto-generated constructor stub
		this.attackPower = 15 + (int)(Math.random() * 10);
		this.type = AttackType.AttackTypeMagic;
		this.manaCosts = 5;
		this.name = "<风暴之锤>";
	}
	
	
}
