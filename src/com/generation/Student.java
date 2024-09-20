package com.generation;

import java.util.ArrayList;
import java.util.List;

public class Student{
    private String name;
    private String id;
    private int age;
    private final List<Course> courseList = new ArrayList<>();

    public Student( String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    } // constructor
    
    // getters and setters
	public String getName() {
		return name;
	} // getName

	public void setName(String name) {
		this.name = name;
	} // setName

	public String getId() {
		return id;
	} // getId

	public void setId(String id) {
		this.id = id;
	} // setID

	public int getAge() {
		return age;
	} // getAge

	public void setAge(int age) {
		this.age = age;
	} // setAge

	public List<Course> getCourseList() {
		return courseList;
	} // List

	// toString();
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", courseList=" + courseList + ", getName()="
				+ getName() + ", getId()=" + getId() + ", getAge()=" + getAge() + ", getCourseList()=" + getCourseList()
				+ "]";
	}
    
} // class Student