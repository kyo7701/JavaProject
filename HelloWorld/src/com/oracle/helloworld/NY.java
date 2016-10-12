package com.oracle.helloworld;

public class NY extends Person{
	public NY() {
		this.speed = 10;
		this.setHP(70);
		this.strength = 15;
		this.setName("聂炎");
		this.weapon = new WoodStick();
		this.shield = new WoodShield();
		super.initPersonData();
		super.showStatus();
	}
	
	public void milk(Person anotherPerson){
		
		int HP = anotherPerson.getCurrentHP();
		int value = (int)(Math.random() * 8) + 1;
		System.out.println("奇异术士出现:"+"聂炎为" + anotherPerson.getName() + "恢复了" + value + "点血量");
		anotherPerson.setCurrentHP(HP + value);
	}
	
	public void smile (Person anotherPerson) {
		String name = anotherPerson.getName();
		System.out.println(this.getName()+ ":" + name + "你个山炮" + " 哈哈哈哈");
		System.out.println(this.getName() + "发动了强力嘲讽技能");
	}
}
