package com.oracle.test4;

public class Fighter {
	
	private int[] heart = new int[2];
	
	public Fighter() {
		//�����ĵ㸳һ�����õ�ֵ
		//[1]����һ�������
		int[] point = null;
		do {
			point = getRandomPoint();
		}while(isUsed(point) == false);  //[2]�ж�������Ƿ����
		
		//[3]�������ã���ֵ��heart����
		heart[0] = point[0];
		heart[1] = point[1];
		
	}
	
	//getRandom,isUsed�������ǲ����ɻ�����Ĺ�����ʹ�õķ�����������̲�Ӧ�ñ�©����������������������private��
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
	
	//����������������������ʾ���ĵ�����꣬������ܱ������ã���ʧȥ������
	public void showHeart() {
		System.out.println(heart[0] + ":" + heart[1]);
	}
	
}
