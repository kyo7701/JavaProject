package com.oracle.helloworld;

public class HelloWorld {
	
	public static void main(String []args) {
		oldSix six = new oldSix();
		WangLaoEr er = new WangLaoEr();
		NY ny = new NY();
		System.out.println("**************大战开始*****************");
		int count = 0;
		while(true) {
			count++;
			System.out.println("***************第" + count + "回合***************");
			if(!six.isAlive || !er.isAlive)break;
			six.physicalAttack(er);
			if(!six.isAlive || !er.isAlive)break;
			er.physicalAttack(six);
			int randomAction = (int)(Math.random() * 10);
			int randomPeople = (int)(Math.random() * 2);
			if(randomAction == 2){
				if(randomPeople == 0) {
					ny.milk(six);
				}else {
					ny.milk(er);
				}
			} else if(randomAction == 3) {
				if(randomPeople == 0) {
					ny.smile(six);
				}else {
					ny.smile(er);
				}
			}
		}
		System.out.println("**************大战结束*****************");
	}
}
