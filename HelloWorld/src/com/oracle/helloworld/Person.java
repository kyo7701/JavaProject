package com.oracle.helloworld;

public class Person {
	private String name;	//人物名称
	public Weapon weapon; 	//武器
	public int defendPower;	//防御力
	private int HP;			//血量
	public int CurrentHP;   //当前血量
	public int MP;			//蓝量
	public int attackPower; //攻击力
	public int intteligence;//智力
	public int strength;    //力量
	public int speed;       //速度
	public double attackRate;//命中率
	public Shield shield;	//护甲
	public double missRate; //失误率
	public double shieldDefendPercent = 0.5;//格档几率
	public int level;		//等级
	public int experience;	//经验值
	public boolean isAlive = true;
	//技能槽位
	public Skill skill1;
	public Skill skill2;
	public Skill skill3;
	public Skill skill4;
	public double getAttackRate() {
		return attackRate;
	}
	public void setAttackRate(double attackRate) {
		this.attackRate = attackRate;
	}

	
	
	Person() {
		this.initSkill();
	}
	
	
	public void initPersonData(){
		this.attackPower = this.attackPower / 3 + this.speed / 4 + this.intteligence / 5;
		this.HP = 50 + this.strength / 3;
		this.MP = 30 + this.intteligence /3;
		this.CurrentHP = this.HP;
		this.attackRate = 0.5 + this.speed /100.0;
		this.missRate = 0.3;
		this.attackPower = (this.strength + this.speed + this.intteligence)/3;
		this.defendPower = this.speed / 3; 
	}
	public void showStatus() {
		System.out.println("********************************");
		System.out.println(this.getName() + "创建完毕" + "," + this.getName() +"属性如下" );
		System.out.println("力量:" + this.strength);
		System.out.println("速度:" + this.speed);
		System.out.println("智力:" + this.intteligence);
		System.out.println("闪躲率:"+ this.missRate);
		System.out.println("防御力:" + this.defendPower);
		System.out.println("血量:" + this.HP);
		System.out.println("攻击力:" + this.attackPower);
		System.out.println("命中率:" + this.attackRate);
		System.out.println("失误率:" + this.missRate);
		System.out.println("护甲:" + this.defendPower);
		System.out.println("格档几率" + this.shieldDefendPercent);
		System.out.println("盾牌:"+this.shield.name);
		System.out.println("武器:"+this.weapon.getName());
	}
	
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
		this.defendPower = strength/10;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		this.missRate = speed /100.0;
	}
	
	public void attack(Person anotherOne) {
		int percent = (int)(Math.random() * 10);
		if(percent < 3) {
			this.attackSkill(anotherOne);
			return;
		}
		
		if (anotherOne == this){
			System.out.println("不能攻击自己");
			return;
		}
		System.out.println(this.name + "使用" + this.getWeapon().getName() + "攻击了" + anotherOne.getName());
		anotherOne.beingAttacked(this.weapon);
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public  int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		this.HP = hP;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void beingAttacked(Weapon weapon) {
		int power = weapon.getAttackPower();
		String output = "";
		if(Math.random() < missRate){
			output = this.name + "使用了他灵活的身法躲过了本次攻击";
			System.out.println(output);
			return;
		}
		int attackPower = this.calculateAttackPower(power);
		if(attackPower < 0){
			output = this.getName() + "护甲太高" + weapon.getName() + "根本无法破防";
			System.out.println(output);
			return;
		}
		if(attackPower ==0){
			output = this.getName() + "格档了本次攻击";
			System.out.println(output);
			return;
		}
		int CurrentHP = this.getCurrentHP() - power;
		System.out.println(this.name + "正在遭受" + weapon.getName()+"的攻击");
		this.setCurrentHP(CurrentHP);
	}
	
	public int getCurrentHP() {
		return CurrentHP;
	}
	public void setCurrentHP(int currentHP) {
		int value = this.CurrentHP - currentHP;
		if(currentHP < this.CurrentHP) {
			System.out.println(this.getName() + "受到了" + value + "点伤害");
		}
		if(currentHP > this.getHP())currentHP = this.getHP();
		if(currentHP <= 0){
			currentHP = 0;
			this.setAlive(false);
		}
		this.CurrentHP = currentHP;
		this.currentHP();
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		if(!isAlive){
			System.out.println(this.getName() + ":再见了世界...");
			System.out.print(this.getName() + "GG了......");
		}
		this.isAlive = isAlive;
	}
	public void beingAttacked(int power) {
		int CurrentHP = this.getCurrentHP() - power;
		this.setCurrentHP(CurrentHP);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attackSkill(Person anotherPerson) {
		
	}
	
	public void physicalAttack(Person anotherPerson) {
		String output = "";
		
		if (anotherPerson == this){
			System.out.println("不能攻击自己");
			return;
		}
		
		if(this.generateRandomPercent(anotherPerson.missRate)){
			output = this.getName() + "对" +  anotherPerson.name +  "的攻击Miss了";
			System.out.println(output);
			return;
		}
		this.triggerSkill(anotherPerson);
		int power = this.calculateAttackPower(this.attackPower);
		
		if(power <= 0){ 
			power = 0;
			output = this.getName() + "对" + anotherPerson.getName() + "发动了物理攻击," + anotherPerson.getName() + "的护甲太厚了,打不动啊.";
			System.out.println(output);
			return;
		}
		output = this.getName() + "对" + anotherPerson.getName() + "造成了" + power + "点物理伤害";
		System.out.println(output);
		anotherPerson.beingAttacked(power);
	}
	
	public boolean triggerSkill(Person anotherPerson) {
		String startOutPut = this.getName() + "对" + anotherPerson.getName() + "发动了";
		if(this.generateRandomPercent(0.3)){//发动人物技能1
			if(this.skill1 !=null){
				startOutPut += this.skill1.name;
				System.out.println(startOutPut);
				this.skill1.SkillToPerson(anotherPerson);
				return true;
			}
		}
		if(this.generateRandomPercent(0.3)){//发动人物技能2
			if(this.skill2 !=null){
				startOutPut += this.skill1.name;
				System.out.println(startOutPut);
				this.skill2.SkillToPerson(anotherPerson);
			}
			return true;
		}
		if(this.generateRandomPercent(0.3)){//发动人物技能3
			if(this.skill3 !=null){
				startOutPut += this.skill1.name;
				System.out.println(startOutPut);
				this.skill3.SkillToPerson(anotherPerson);
			}
			return true;
		}
		if(this.generateRandomPercent(0.3)){//发动人物技能4
			if(this.skill4 != null){
				startOutPut += this.skill1.name;
				System.out.println(startOutPut);
				this.skill4.SkillToPerson(anotherPerson);
			}
			return true;
		}
		return false;
	}
	
    public void initSkill(){ 
		this.skill1 = null;
		this.skill2 = null;
		this.skill3 = null;
		this.skill4 = null;
	}
	
	public void beingAttackedByMagic (int power) {
		int HP = this.getCurrentHP();
		int currentHP = HP - power;
		this.setCurrentHP(currentHP);
	}
	
	public int calculateAttackPower(int attackPower) {
		//判断是否拥有武器
		int defend  = 0;
		int attackValue = 0;
		if(this.shield != null) {
			if(this.generateRandomPercent(shieldDefendPercent))
				return 0;
			else {
				defend = this.defendPower;
			}
		}
		attackValue = attackPower - defend;
		if(attackValue < 0 )attackValue = 0;
		return attackValue;
	}
	public void currentHP(){
		System.out.println(this.getName() + "当前HP:" + this.getCurrentHP());
	}
	
	public boolean generateRandomPercent(double percent) {
		return (Math.random() < percent)?true:false;
	}
}
