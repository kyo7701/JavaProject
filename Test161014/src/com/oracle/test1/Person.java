package com.oracle.test1;

public class Person implements Comparable {
	
	private String name;
	private int age;
	private String id;
	
	private int high;
	
	public Person() {}

	public Person(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * 实现从Compareable接口中得到的compareTo方法使得Person泪能够进行[自然排序]
	 * 在自然排序中，会判断compareTo方法返回值的正负
	 * 预定计算顺序：this - o
	 * 负：this < o
	 * 0：this == o
	 * 正：this > o
	 * 自然排序的缺陷：一个类了只能有一个compareTo方法
	 * 一个compareTo方法只能比较一组准则
	 * 自然排序的优点：排序效率高
	 */
	
	@Override
	public int compareTo(Object o) {
		
		//防空：防异类，防null，防“同一个对象”this == o
		
		Person p = (Person) o;
		
		/*
		int result = -1;
		
		if(this.age < p.age) {
			result = -1;
		}else if(this.age == p.age) {
			result = 0;
		}else {
			result = 1;
		}
		*/
		
//		int result = this.age < p.age ? -1 : this.age == p.age ? 0 : 1;
		
		return p.age - this.age;  //自然排序此时是降序的
	}
}
