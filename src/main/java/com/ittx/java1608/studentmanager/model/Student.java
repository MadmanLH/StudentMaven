package com.ittx.java1608.studentmanager.model;

public class Student {
	private String id; // ID
	private String name; // 姓名
	private int age; // 年龄
	private String sex; // 性别   0男  1女
	private String grade; // 姓名
	private String address; // 姓名
	private String head_portraits; //头像
	public Student() {
	}


	public Student(String id, String name, int age, String sex, String grade, String address, String head_portraits) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.grade = grade;
		this.address = address;
		this.head_portraits = head_portraits;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHeaderUri() {
		return head_portraits;
	}

	public void setHeaderUri(String head_portraits) {
		this.head_portraits = head_portraits;
	}

	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", grade=" + grade + ", address="
				+ address + ", head_portraits=" + head_portraits + "]";
	}


}
