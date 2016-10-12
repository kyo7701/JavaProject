package com.k99.collection;


public class TestArrayList {
	public static void main(String []args) {
		LinkedList link = new LinkedList();
		
		link.AddElement(15);
		link.AddElement(17);
		link.AddElement(19);
		link.AddElement(15);
		link.headInsert(1);
		link.traverseLinkList();
		link.midInsert(2, 3);
		link.rePlaceElement(50, 50);
		link.traverseLinkList();
	}
}
