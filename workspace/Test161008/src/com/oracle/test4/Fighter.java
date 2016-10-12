package com.oracle.test4;

public class Fighter {
	
	private int[] heart = new int[2];
	
	public Fighter() {
		//给机心点赋一个可用的值
		//[1]产生一个随机点
		int[] point = null;
		do {
			point = getRandomPoint();
		}while(isUsed(point) == false);  //[2]判断随机点是否可用
		
		//[3]随机点可用，赋值给heart属性
		heart[0] = point[0];
		heart[1] = point[1];
		
	}
	
	//getRandom,isUsed方法都是产生飞机对象的过程中使用的方法，这个过程不应该暴漏出来，所以这两个方法是private的
	private int[] getRandomPoint() {
		int[] point = new int[2];
		point[0] = ((int)(Math.random() * 10));
		point[1] = ((int)(Math.random() * 10));
		return point;
	}
	
	private boolean isUsed(int[] point) {
		int row = point[0];
		int col = point[1];
		if(row - 2 < 0 || row + 2 > 9 || col - 2 < 0 || col + 2 > 9) {
			return false;
		}
		return true;
	}
	
	//这个方法的作用是想外界显示机心点的坐标，如果不能被外界调用，就失去了意义
	public void showHeart() {
		System.out.println(heart[0] + ":" + heart[1]);
	}
	
}
