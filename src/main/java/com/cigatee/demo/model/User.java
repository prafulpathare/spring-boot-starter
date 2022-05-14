package com.cigatee.demo.model;

public class User {

	private static long idCounter;
	private long id;
	private String name;
	private String email;
	private String password;
	private int age;

	public User() {}
	
	public User(String name, String email, String password, int age) {
		this.id = 1000 + idCounter++;
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
