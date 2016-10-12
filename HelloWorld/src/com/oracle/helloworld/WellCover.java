package com.oracle.helloworld;

public class WellCover extends Weapon{
	public WellCover() {
		this.setName("井盖");
		this.setAttackPower((int)(Math.random() * 15 + 8));
	}
	public void attack() {
		System.out.println("井盖投掷");
	}
}
