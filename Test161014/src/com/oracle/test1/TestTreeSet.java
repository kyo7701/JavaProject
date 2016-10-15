package com.oracle.test1;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		MyComparetor mc = new MyComparetor(); //声明一个教官：比较器对象
		
		//对于同一个TreeSet来说，定制排序和自然排序是可以兼容的，但是定制排序的优先级更高，当自然排序和定制排序产生冲突的时候，听定制排序的
		TreeSet set1 = new TreeSet(mc);
		
		set1.add(new Person("zhangsan", 22, "123456"));
		set1.add(new Person("lisi", 30, "654321"));
		set1.add(new Person("chenliu", 18, "666666"));
		set1.add(new Person("wangwu", 18, "555555"));
		
		/*
		 * TreeSet的元素也不能重复
		 * TreeSet中判别两个元素是否重复的标准已经不是hashCode和equals方法
		 * 是元素compareTo方法的返回值
		 * 两个元素如果compareTo方法返回0，TreeSet就会任务这两个元素是“重复”的
		 */
		
		Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
	
}
