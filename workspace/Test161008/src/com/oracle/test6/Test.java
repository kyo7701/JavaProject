package com.oracle.test6;

public class Test {
	
	public static void main(String[] args) {
		
		PlayerAirport pa = new PlayerAirport();
//		pa.getDir();  //子类并没有继承父类中private修饰的私有方法，所以无法调用
		pa.paintFighter();  //即使一个方法中存在调用private修饰的其他过程方法，但是这个方法能不能被继承，仅和当前方法的继承权限修饰符相关
		pa.showAirportArray();  //在子类中扩展的属性和方法更能够调用
		
	}
	
}
