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

	//通过重写继承自Object类的toString方法，可以在调用输出的时候直接打印对象的属性值
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
	public int hashCode() {  //对象的特征码：哈希编码，散列值
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//通过重写equals方法，实现两个Person类对象的信息比较
	/*
	@Override
	public boolean equals(Object o) {
		
		/**
		 * Person p2 = new Person();
		 * p1.equals(p2);
		 * Object o = p2;
		
		//[0]为了能够调用定义在Person类中的getName等方法，需要将o强转成Person类型
		Person p = null;
		if(o instanceof Person) {
			p = (Person) o;
		}else {
			//传进来的对象不是Person类型：类型不相同不能直接对信息进行比较
			return false;
		}
		
		//中间就是两个对象（调用者+o）之间信息的比较
		//[1]比name属性
		if(this.name.equals(p.getName()) == false) {  //两个Person对象的name属性值不相同
			return false;
		}
		
		//[2]比age属性
		if(this.age != p.getAge()) {
			return false;
		}
		
		//[3]比id属性
		if(this.id.equals(p.getId()) == false) {
			return false;
		}
		
		//只有所有的属性都相同，才能确定两个对象的内容完全“相同”
		return true;
		
	}
	*/
	
	@Override
	public boolean equals(Object obj) {
		//[1]直接比较地址，如果两个引用变量指向的地址相同，说明指向同一个对象本体
		if (this == obj)
			return true;
		
		//[2]防空：防止直接传入一个null对象
		if (obj == null)
			return false;
		
		//[3]进行类型比较：只有类型相同的两个对象，才能够进行比较
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		
		//[4]属性值的比较
		/*
		//比较age
		if (age != other.age)
			return false;
		*/
		
		//比较id：此时如果两个Person类的对象，id属性值相同，即相当于equals返回真
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		
		/*
		//比较name
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		*/
		return true;
	}
	
}
