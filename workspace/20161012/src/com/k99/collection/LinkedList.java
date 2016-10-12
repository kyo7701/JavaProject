package com.k99.collection;

public class LinkedList {
	private Node head;
	private int size = 1;

	public int getSize() {
		return size - 1;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public LinkedList() {
		// 初始化头结点
		this.head = new Node(0);
	}
	
	/**
	 * 为链表添加元素,默认添加到链表末尾.
	 * @param element
	 */
	
	public void AddElement(int element) {
		this.lastInsert(element);
		this.size += 1;
	}
	
	/**
	 * 链表插入方法:每次插入到头结点之后
	 * @param element
	 */
	
	public void headInsert(int element) {
		Node newElement = this.CreateElement(element);
		newElement.next = this.head.next;
		this.head.next = newElement;
	}
	
	/***
	 * 链表中间插入,插入到指定元素的后面.
	 * @param pos 
	 * @param element
	 */

	public void midInsert(int pos, int element) {
		int count = 0;

		if (pos > this.size) {
			return;
		}
		Node tmp = this.searchElementAtPosition(pos);
		Node newNode = this.CreateElement(element);
		newNode.next = tmp.next;
		tmp.next = newNode;
	}
	
	/**
	 * 在链表最后面插入元素
	 * @param element
	 */

	public void lastInsert(int element) {
		Node tmp = this.lastNode();
		Node newElement = new Node(element);
		tmp.next = newElement;
	}

	/**
	 * 在链表中查找值为element的元素
	 * @param element
	 * @return 返回结点
	 */
	public Node search(int element) {
		Node tmp = this.head;
		int count = 0;
		while (tmp.next != null) {
			if (tmp.value == element)
				return tmp;
			tmp = tmp.next;
			count++;
		}
		return null;
	}
	
	
	/**
	 * 在链表中查找指定位置的结点
	 * @param pos
	 * @return 结点
	 */
	
	public Node searchElementAtPosition(int pos) {
		Node tmp = this.head.next;
		int count = 0;
		while (tmp != null) {
			if (count == pos)
				return tmp;
			tmp = tmp.next;
			count++;
		}
		System.out.println("count" + count);
		return null;
	}
	
	/**
	 * 替换链表指定位置的元素值
	 * @param element
	 * @param index
	 */

	public void rePlaceElement(int element, int index) {
		if(index > this.getSize()) {
			System.out.println("Index out of bounds");
			throw new IllegalAccessError("要更改的元素index超出已有元素index");
		}
		Node node = this.searchElementAtPosition(index);
		System.out.println("替换前:" + node.value);
		node.value = element;
		System.out.println("替换后:" + node.value);
	}

	public int delElement(int pos) {
		if (pos > this.getSize())
			return -1;

		Node node = this.searchElementAtPosition(pos - 1);
		Node delElement = node.next;
		node.next = delElement.next;

		return delElement.value;
	}

	public Node lastNode() {
		Node tmp = this.head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		return tmp;
	}

	public Node traverseLinkList(int pos) {
		Node tmp = this.head.next;
		int count = 0;
		while (tmp != null) {
			if (pos == count)
				return tmp;
			count++;
			tmp = tmp.next;
		}
		return null;
	}
	
	/*
	 * 
	 */
	public void traverseLinkList() {
		Node tmp = this.head.next;
		int count = 1;
		while (tmp != null) {
			System.out.println("链表中第" + count + "个元素:" + tmp.value);
			count++;
			tmp = tmp.next;
		}
	}

	public Node CreateElement(int value) {
		Node ele = new Node(value);
		ele.next = null;
		return ele;
	}

}
