package com.oracle.test1;

import java.util.Comparator;

public class MyComparetor implements Comparator {

	/**
	 * 凡是实现了Comparetor接口的类都是比较器类
	 * 类似于教官
	 * 通过比较器类可以对两个对象的指定的属性进行比较，称作[定制排序]
	 * 优点：通过定义不同的排序器（教官）可以实现对同一类对象中不同属性的排序，只要使用不同的排序其对象就行
	 * 缺点：①需要额外声明排序器②排序效率略低于自然排序
	 */
	
	@Override
	public int compare(Object o1, Object o2) {
		
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		
		return p1.getAge() - p2.getAge();
	}

}
