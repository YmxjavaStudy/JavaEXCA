package com.java.ymx.Ecxe;

import lombok.Getter;
import lombok.Setter;


public class Person {
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private int age;
	
	//构造方法
	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public Person(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	//构造方法结束

	@Override
	public String toString() {
		return "[" + this.name + "  " + this.age + "]";
	}
	
	public void printPersonSelf() {
		System.out.println(this.toString());
	}
	
}
