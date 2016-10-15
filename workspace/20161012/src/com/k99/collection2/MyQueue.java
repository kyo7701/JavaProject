package com.k99.collection2;

import java.util.ArrayList;

public class MyQueue extends Collection {
	
	public ArrayList<Integer> list;
	
	public MyQueue(int size) {
		this.size = size;
		this.list = new ArrayList<Integer>(size);
	}
	
	public MyQueue() {
		this.size = 10;
		this.list = new ArrayList<Integer>(this.size);
	}
	
	
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		Integer i = (Integer)this.list.remove(this.size - 1);
		return i.intValue();
	}

	@Override
	public void push(int value) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int peek() {
		return 0;
	}
	
	public boolean grow() {
		return true; 
	}

}
