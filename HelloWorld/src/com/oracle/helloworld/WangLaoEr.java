package com.oracle.helloworld;

public class WangLaoEr extends Person{
	
	WangLaoEr() {
		this.weapon = new WellCover();
		this.setSpeed(20);
		this.strength = 50;
		this.intteligence = 15;
		this.setName("王老二");
		this.shield = new SteelShield();
		super.initPersonData();
		super.showStatus();
	}
	
	public void attackSkill(Person anotherPerson){
		int magicPower = 7;
		String name = "<井盖投掷>";
		System.out.println(this.getName() + "使用攻击技:" + name  + "攻击了"+ anotherPerson.getName());
		anotherPerson.beingAttackedByMagic(magicPower);
	}
	
}
