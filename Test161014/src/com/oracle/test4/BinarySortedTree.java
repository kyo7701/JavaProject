package com.oracle.test4;

import java.util.Stack;

public class BinarySortedTree {
	
	/**
	 * 二叉排序树
	 */
	
	private Node root;
	
	private int size;
	
	public BinarySortedTree(Comparable element) {
		root = new Node(element, null, null, null);
		size++;
	}
	
	/**
	 * 添加元素的方法
	 * 被添加进入二叉排序树的元素应该是可比较的
	 * 因为只有可比较的元素才能够排序
	 * 遇空则挂，遇满则比
	 * @param element 添加元素
	 */
	public void add(Comparable element) {
		
		//[1]将传进来的元素包装在一个Node对象中
		Node node = new Node(element, null, null, null);
		
		//[2]遇空则挂，遇满则比
		createBST(root, node);
		
	}
	
	/**
	 * 从根节点开始一路向下，遇空则挂，遇满则比
	 * @param node 等待被下挂的节点
	 */
	private void createBST(Node root, Node node) {
		
		Node tmp = root;
		
		if(((Comparable)tmp.data).compareTo(node.data) < 0) {  //tmp < node : node应该是tmp的右孩子
			if(tmp.rchild == null) {  //递归出口
				tmp.rchild = node;  //父亲挂孩子
				node.parent = tmp;  //孩子指父亲
				size++;
				return;
			}else {  //tmp.rchild != null
				createBST(tmp.rchild, node);
			}
		}else {  //tmp >= node : node应该是tmp的左孩子
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
	 * 在一个二叉排序树建立完毕之后，需要通过中序遍历的形式将全部元素有序返回
	 * @return 有序的元素数组
	 */
	public Object[] getOrder() {
		
		Stack s = new Stack();
		
		Integer index = 0;  //index用来控制datas的走向
		Object[] datas = new Object[size];
		this.iteratBST(root, s, datas, index);
		
		
		return datas;
	}
	
	/**
	 * 用来遍历不同根对应的子树
	 */
	private void iteratBST(Node root, Stack s, Object[] datas, Integer index) {
		
		Node tmp = root;
		
		s.push(tmp);  //首先入栈
		//遍历左子树
		if(tmp.lchild == null) {  //对于中序遍历来说，做子树为空，直接访问中间节点  
			datas[index] = ((Node)s.pop()).data;
			index++;
		}else {
			iteratBST(tmp.lchild, s, datas, index);
		} 
		
		//遍历右子树
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
