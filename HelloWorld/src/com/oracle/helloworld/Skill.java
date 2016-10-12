package com.oracle.helloworld;

public class Skill extends BaseSkill {
	public AttackType type;
	public int attackPower;
	public int manaCosts;
	
	Skill(){
		
	}
	public void SkillToPerson(Person anotherPerson){
		String output = "";
		
		if(type == AttackType.AttackTypeMagic)this.MagicToPerson(anotherPerson);
		if(anotherPerson.generateRandomPercent(anotherPerson.missRate)){
			output = this.name + "Miss";
			System.out.println(output);
			return;
		}
		int power = anotherPerson.calculateAttackPower(this.attackPower);
		if(power <= 0) {
			output = anotherPerson.getName()+ "护甲太厚了," + this.name + "并未攻破" + anotherPerson.getName() + "的护甲";
			System.out.println(output);
			return;
		}
		int HP = anotherPerson.getCurrentHP();
		anotherPerson.setCurrentHP(HP - power);
	}
	
	public void MagicToPerson(Person anotherPerson) {
		
	}
}
