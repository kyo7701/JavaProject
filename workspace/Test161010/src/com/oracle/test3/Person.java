package com.oracle.test3;

public class Person {
	
	private String name;
	private int age;
	private String id;
	
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

	//ͨ����д�̳���Object���toString�����������ڵ��������ʱ��ֱ�Ӵ�ӡ���������ֵ
	/*
	@Override
	public String toString() {
		return "Person: name=" + this.name + ", age=" + this.age + ", id=" + this.id;
	}
	*/
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	/*
	@Override
	public int hashCode() {
		return age + name.hashCode() + id.hashCode();
	}
	*/
	
	@Override
	public int hashCode() {  //����������룺��ϣ���룬ɢ��ֵ
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//ͨ����дequals������ʵ������Person��������Ϣ�Ƚ�
	/*
	@Override
	public boolean equals(Object o) {
		
		/**
		 * Person p2 = new Person();
		 * p1.equals(p2);
		 * Object o = p2;
		
		//[0]Ϊ���ܹ����ö�����Person���е�getName�ȷ�������Ҫ��oǿת��Person����
		Person p = null;
		if(o instanceof Person) {
			p = (Person) o;
		}else {
			//�������Ķ�����Person���ͣ����Ͳ���ͬ����ֱ�Ӷ���Ϣ���бȽ�
			return false;
		}
		
		//�м�����������󣨵�����+o��֮����Ϣ�ıȽ�
		//[1]��name����
		if(this.name.equals(p.getName()) == false) {  //����Person�����name����ֵ����ͬ
			return false;
		}
		
		//[2]��age����
		if(this.age != p.getAge()) {
			return false;
		}
		
		//[3]��id����
		if(this.id.equals(p.getId()) == false) {
			return false;
		}
		
		//ֻ�����е����Զ���ͬ������ȷ�����������������ȫ����ͬ��
		return true;
		
	}
	*/
	
	@Override
	public boolean equals(Object obj) {
		//[1]ֱ�ӱȽϵ�ַ������������ñ���ָ��ĵ�ַ��ͬ��˵��ָ��ͬһ��������
		if (this == obj)
			return true;
		
		//[2]���գ���ֱֹ�Ӵ���һ��null����
		if (obj == null)
			return false;
		
		//[3]�������ͱȽϣ�ֻ��������ͬ���������󣬲��ܹ����бȽ�
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		
		//[4]����ֵ�ıȽ�
		/*
		//�Ƚ�age
		if (age != other.age)
			return false;
		*/
		
		//�Ƚ�id����ʱ�������Person��Ķ���id����ֵ��ͬ�����൱��equals������
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		
		/*
		//�Ƚ�name
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		*/
		return true;
	}
	
}
