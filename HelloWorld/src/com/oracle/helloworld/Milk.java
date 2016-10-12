package com.oracle.helloworld;

public class Milk extends Magic {
	public int curePower;
	public Milk(){
		this.name = "<治愈术>";
		curePower = 6 + this.level * 3;
	}
	
	public void MilkSomeBody(Person anotherPerson){
		int HP = anotherPerson.getCurrentHP();
		anotherPerson.setCurrentHP(HP + curePower);
	}
	
	@Override
	public void MagicToPerson(Person anotherPerson) {
		super.MagicToPerson(anotherPerson);
		this.MilkSomeBody(anotherPerson);
		
	}
}
