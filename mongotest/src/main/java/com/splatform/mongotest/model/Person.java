package com.splatform.mongotest.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <p>
 * descrption:
 * </p>
 * 
 * @author fuzl
 * @date 2015年4月17日
 */
@Document
public class Person implements Serializable{
	private String id;
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
