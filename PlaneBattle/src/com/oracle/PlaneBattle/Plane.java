package com.oracle.PlaneBattle;

public class Plane {
	private int []point;
	private String name;
	private int health;
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getPoint() {
		return point;
	}
	public void setPoint(int[] point) {
		this.point = point;
	}
	Plane() {
		point = this.getRandomPosition();
		health = 5;
	}
	public int[] getRandomPosition() {
		int []array = new int[2];
		int x = (int)(Math.random() * 10);
		int y = (int)(Math.random() * 10); 
		array[0] = x;
		array[1] = y;
		return array;
	}
	
	
}
