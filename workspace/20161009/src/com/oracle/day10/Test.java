package com.oracle.day10;

import com.oracle.test.Parameter1;
import com.oracle.test.Season;

public class Test implements TestInterface {
	
	public static void main(String []args) {
		Student s = new Student();
		final Person a1 = new Person();
		a1.name = "lala";
		a1.name = "lala";
		Person.nothing();
		//Scanner sc = new Scanner(System.in);
		//String str = sc.next();
		//System.out.println(str);
		/**/
		Parameter1 param = new Parameter1();
		param.parseInt();
		Parameter1.parseString();
		param.parseString();
		Test t1 = new Test();
		System.out.println("------------------------");
		boolean b =  t1 instanceof TestInterface;
		System.out.println(b);
		System.out.println("------------------------");
		System.out.println(t1);
		
		System.out.println("------------------------");
		Season s1 = Season.Spring;
		System.out.println(Season.valueOf("Summer"));
		
		for (Season s5 :Season.values()) {
			
		}
		Student p  = new Student();
		System.out.println("------------------------");
		InputImp imp = new InputImp();
		System.out.println(imp.inputInt();
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String des = this.getClass().getName() + this.hashCode();
		return des;
	}
}
