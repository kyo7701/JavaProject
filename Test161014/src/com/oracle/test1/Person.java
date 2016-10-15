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
	 * ʵ�ִ�Compareable�ӿ��еõ���compareTo����ʹ��Person���ܹ�����[��Ȼ����]
	 * ����Ȼ�����У����ж�compareTo��������ֵ������
	 * Ԥ������˳��this - o
	 * ����this < o
	 * 0��this == o
	 * ����this > o
	 * ��Ȼ�����ȱ�ݣ�һ������ֻ����һ��compareTo����
	 * һ��compareTo����ֻ�ܱȽ�һ��׼��
	 * ��Ȼ������ŵ㣺����Ч�ʸ�
	 */
	
	@Override
	public int compareTo(Object o) {
		
		//���գ������࣬��null������ͬһ������this == o
		
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
		
		return p.age - this.age;  //��Ȼ�����ʱ�ǽ����
	}
}
