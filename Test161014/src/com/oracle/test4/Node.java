package com.oracle.test4;

public class Node {
	
	/**
	 * 二叉树的节点
	 */
	
	public Object data;  //数据域
	
	public Node parent;  //父节点域
	public Node lchild;  //左孩子节点
	public Node rchild;  //右孩子节点
	
	public Node() {}

	public Node(Object data, Node parent, Node lchild, Node rchild) {
		super();
		this.data = data;
		this.parent = parent;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	
}
