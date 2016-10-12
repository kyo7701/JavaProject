package com.oracle.PlaneBattle;

public class GameLogic {
	public void play() {
		// 初始化飞机场
		Airport playerAirport = new Airport();
		Airport computerAirport = new Airport();
		// 生成敌我飞机
		Plane computer = new Plane();
		computer.setName("电脑");
		Plane player = new Plane();
		player.setName("玩家");
		int []point = player.getRandomPosition();
		while(!playerAirport.canUsePoint(point)) {
			point = player.getRandomPosition();
		}
		player.setPoint(point);
		int[] comPoint = computer.getRandomPosition();
		while(!computerAirport.canUsePoint(comPoint)) {
			comPoint = computer.getRandomPosition();
		}
		computer.setPoint(comPoint);
		
		//在飞机场上停靠飞机
		playerAirport.generatePlane(player.getPoint());
		computerAirport.generatePlane(computer.getPoint());
		playerAirport.show();
		computerAirport.show();
		
		while(true) {
			// 开始电脑回合,随机位置
			if(computer.getHealth() == 0) {
				System.out.println("************You win!**************");
				break;
			}
			int[] comAttactkPoint = computer.getRandomPosition();
			if(playerAirport.checkPlaneAtPoint(comAttactkPoint)) {
				System.out.println("************电脑击中了你,你的血量-1,你的当前血量:" + player.getHealth());
				int health = player.getHealth();
				if(health > 0)health--;
				player.setHealth(health);
			}else {
				System.out.println("************电脑智障,打空了.**************");
			}
			// 开始player回合
			if(player.getHealth() == 0) {
				System.out.println("************游戏结束,你被电脑干掉了!**************");
				break;
			}
			int[] playerAttackPoint = player.getRandomPosition();
			if(computerAirport.checkPlaneAtPoint(playerAttackPoint)) {
				System.out.println("************你击中了电脑,电脑血量-1,电脑当前血量:" + computer.getHealth());
				int health = computer.getHealth();
				if(health > 0)health--;
				computer.setHealth(health);
			} else {
				System.out.println("************你智障,打空了.**************");
			}
		}
		
	}
	public static void main(String []args) {
		GameLogic logic = new GameLogic();
		logic.play();
	}
}
