package com.oracle.helloworld;

public class oldSix extends Person {
	public oldSix() {
		// TODO Auto-generated constructor stub
		this.weapon = new PigShit();
		this.shield = new WoodShield();
		this.setName("猪老六");
		this.intteligence = 3;
		this.speed = 15;
		this.strength = 99;
		this.skill1 = new StormThor();
		super.initPersonData();
		super.showStatus();
	} 
	
	@Override
	public void initSkill() {
		// TODO Auto-generated method stub
		super.initSkill();
		
	}
	
	public void skill() {
		int curePower = 15;
		String name = "<猪蹄好咸>";
		System.out.println(this.getName() + "发动了被动技:" + name);
		int HP = this.getHP();
		this.setHP(HP + curePower); 
		currentHP();
	}
}
