package com.oracle.test6;

public class PlayerAirport extends Airport {
	
	public void showAirportArray() {
		//�ڵ�ǰ������PlayerAirport�У��޷�ֱ�ӷ����ʸ���Airport��˽������int[][] airportArray
		//���Ǹ������ṩ��public���εĸ���get��set��������Щ�����ܹ�������̳У�����������ͨ����Щ�̳����ķ������ʸ��������
		int[][] airportArray = this.getAirportArray();
		for(int i = 0; i < airportArray.length; i++) {
			for(int j = 0; j < airportArray[i].length; j++) {
				System.out.print(airportArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
