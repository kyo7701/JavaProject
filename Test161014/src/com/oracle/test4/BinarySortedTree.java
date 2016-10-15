package com.oracle.test4;

import java.util.Stack;

public class BinarySortedTree {
	
	/**
	 * ����������
	 */
	
	private Node root;
	
	private int size;
	
	public BinarySortedTree(Comparable element) {
		root = new Node(element, null, null, null);
		size++;
	}
	
	/**
	 * ���Ԫ�صķ���
	 * ����ӽ��������������Ԫ��Ӧ���ǿɱȽϵ�
	 * ��Ϊֻ�пɱȽϵ�Ԫ�ز��ܹ�����
	 * ������ң��������
	 * @param element ���Ԫ��
	 */
	public void add(Comparable element) {
		
		//[1]����������Ԫ�ذ�װ��һ��Node������
		Node node = new Node(element, null, null, null);
		
		//[2]������ң��������
		createBST(root, node);
		
	}
	
	/**
	 * �Ӹ��ڵ㿪ʼһ·���£�������ң��������
	 * @param node �ȴ����¹ҵĽڵ�
	 */
	private void createBST(Node root, Node node) {
		
		Node tmp = root;
		
		if(((Comparable)tmp.data).compareTo(node.data) < 0) {  //tmp < node : nodeӦ����tmp���Һ���
			if(tmp.rchild == null) {  //�ݹ����
				tmp.rchild = node;  //���׹Һ���
				node.parent = tmp;  //����ָ����
				size++;
				return;
			}else {  //tmp.rchild != null
				createBST(tmp.rchild, node);
			}
		}else {  //tmp >= node : nodeӦ����tmp������
			if(tmp.lchild == null) {
				tmp.lchild = node;
				node.parent = tmp;
				size++;
				return;
			}else {
				createBST(tmp.lchild, node);
			}
		}
		
	}
	
	/**
	 * ��һ�������������������֮����Ҫͨ�������������ʽ��ȫ��Ԫ�����򷵻�
	 * @return �����Ԫ������
	 */
	public Object[] getOrder() {
		
		Stack s = new Stack();
		
		Integer index = 0;  //index��������datas������
		Object[] datas = new Object[size];
		this.iteratBST(root, s, datas, index);
		
		
		return datas;
	}
	
	/**
	 * ����������ͬ����Ӧ������
	 */
	private void iteratBST(Node root, Stack s, Object[] datas, Integer index) {
		
		Node tmp = root;
		
		s.push(tmp);  //������ջ
		//����������
		if(tmp.lchild == null) {  //�������������˵��������Ϊ�գ�ֱ�ӷ����м�ڵ�  
			datas[index] = ((Node)s.pop()).data;
			index++;
		}else {
			iteratBST(tmp.lchild, s, datas, index);
		} 
		
		//����������
		if(tmp.rchild == null) {
			datas[index++] = ((Node)s.pop()).data;
			return;
		}else {
			iteratBST(tmp.rchild, s, datas, index);
		}
		
	}
	
	public int size() {
		return this.size;
	}
	
}
