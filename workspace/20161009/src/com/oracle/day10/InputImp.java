package com.oracle.day10;

import java.util.Scanner;

public class InputImp implements InputBase {

	@Override
	public int inputInt() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a number:");
		return sc.nextInt();
	}

	@Override
	public String inputString() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		return sc.next();
	}

}
