package com.oracle.test2;

public enum Season {
	
	//ö����Ķ���������ö���൱��
	Spring("��ů����"),  //ö���������������൱��ֱ�ӵ���new�����������֮��ʹ�ö��Ÿ���������ʹ�÷ֺŸ���
	Summer("��������"),  //ö����Ķ�������ʹ�����η����Σ��൱�ڴ������η���public static final
	Fall("�����ˬ"),  //����������ö��������ͬʱ��ö�����������Ը���ֵ
	Winter("�����Ĳ�");
	
	//��ö�����������һЩ��������
	private String dis;  //��ÿһ������дһ������
	
	private Season(String dis) {  //ö����ͨ��˽�л����췽�����ﵽ��ֹʵ���������Ŀ��
		this.dis = dis;
	}

	public String getDis() {
		return dis;
	}

	public void setDis(String dis) {
		this.dis = dis;
	}
	
}
