package com.learning.learnspringboot.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "COURSES")
public class Courses {
	@Id
	@GeneratedValue // Starts id by 1
	private int ID;
	@Column(name = "NAME")
	private String name;
	@Column(name = "AUTHOR")
	private String author;

	public Courses() {
	}

	public Courses(int id, String name, String author) {
		super();
		this.ID = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Courses [id=" + ID + ", name=" + name + ", author=" + author + "]";
	}

}
