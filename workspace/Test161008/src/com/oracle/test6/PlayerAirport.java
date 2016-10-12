package com.oracle.test6;

public class PlayerAirport extends Airport {
	
	public void showAirportArray() {
		//在当前的子类PlayerAirport中，无法直接方法问父类Airport的私有属性int[][] airportArray
		//但是父类中提供了public修饰的各种get，set方法，这些方法能够被子类继承，子类对象可以通过这些继承来的方法访问父类的属性
		int[][] airportArray = this.getAirportArray();
		for(int i = 0; i < airportArray.length; i++) {
			for(int j = 0; j < airportArray[i].length; j++) {
				System.out.print(airportArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
