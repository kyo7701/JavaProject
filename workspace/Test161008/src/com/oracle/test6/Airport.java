package com.oracle.test6;

public class Airport {
	
	/*
	 * 机场类：是电脑飞机场和玩家飞机场的父类
	 */
	
	//按照封装性原理：对象属性应该使用private关键字修饰，使用get，set方法访问
	//按照继承性原理：这两个属性想要被子类继承，需要使用public进行修饰
	private int size = 10;
	private int[][] airportArray = new int[size][size];
	
	private int getDir() {  //获取飞机朝向的方法，属于画飞机的过程方法，所以使用private进行修饰：重点观察在子类中继承的情况
		return 0;
	}
	
	public void paintFighter() {  //在一个public修饰的方法中调用private修饰的方法，这个方法能否被被子类所继承
		getDir();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[][] getAirportArray() {
		return airportArray;
	}

	public void setAirportArray(int[][] airportArray) {
		this.airportArray = airportArray;
	}
	
}
