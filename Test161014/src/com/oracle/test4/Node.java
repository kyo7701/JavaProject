package com.oracle.test4;

public class Node {
	
	/**
	 * �������Ľڵ�
	 */
	
	public Object data;  //������
	
	public Node parent;  //���ڵ���
	public Node lchild;  //���ӽڵ�
	public Node rchild;  //�Һ��ӽڵ�
	
	public Node() {}

	public Node(Object data, Node parent, Node lchild, Node rchild) {
		super();
		this.data = data;
		this.parent = parent;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	
}
