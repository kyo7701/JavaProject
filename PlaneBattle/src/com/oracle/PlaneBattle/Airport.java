package com.oracle.PlaneBattle;

public class Airport {
	private int [][] airport;
	public int[][] getAirport() {
		return airport;
	}
	public Airport() {
		airport = new int[10][10];
//		for(int i = 0; i<10;i++) {
//			for (int j = 0;j<10;j++) {
//				airport[i][j] = 0;
//			}
//		}
		// TODO Auto-generated constructor stub
	}
	public void setAirport(int[][] airport) {
		this.airport = airport;
	}


	public void show() {
		System.out.println("***********打印飞机场中.....*************");
		for (int array[]:airport) {
			for (int value:array) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
	
	public boolean canUsePoint(int []point) {// - - - - -
		
		int x = point[0];
		int y = point[1];
		System.out.println( x + "," + y);
		int length = airport[0].length;
		if(x < 2 || x > length-1-2 ||y < 2 || y > length-1-2)return false;
		return true;
	}
	
	public void generatePlane(int []point) {
		
		int x = point[0];
		int y = point[1];
		airport[x][y] = 1;
		System.out.println("***********停靠飞机中.....*************");
		System.out.println(x+","+y);
		//机头
		airport[x-2][y] = 1;
		airport[x-1][y] = 1;
		//机身
		airport[x+1][y] = 1;
		//左翼
		airport[x-1][y-1] = 1;
		airport[x-1][y-2] = 1;
		//右翼
		airport[x-1][y+1] = 1;
		airport[x-1][y+2] = 1;
		//机尾zuo
		airport[x+1][y-1] = 1;
		//机尾you
		airport[x+1][y+1] = 1;
	}
	public boolean checkPlaneAtPoint(int []point) {
		int x = point[0];
		int y = point[1];
		if(airport[x][y] == 1) {
			return true;
		}
		return false;
	}
}
