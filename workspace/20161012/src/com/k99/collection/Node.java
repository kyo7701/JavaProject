package com.k99.collection;

public class Node {
  int value;   //������
  Node next;    //ָ����
  
  public Node(int x) {
	  this.value = x;
	  this.next = null;
  }

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}
  
}


