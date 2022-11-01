package com.mongo.example.models;

import org.springframework.data.annotation.Transient;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student4 {
	 @Transient
	    public static final String SEQUENCE_NAME = "users_sequence";
	 @Id
	private String id;
	private String name;
	private String city;
	private String college;


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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Student4(String id, String name, String city, String college) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.college = college;
	}
	
}
