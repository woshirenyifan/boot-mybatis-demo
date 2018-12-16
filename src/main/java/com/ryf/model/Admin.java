package com.ryf.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;



public class Admin {
	
	private int id;
	private String name;
	private double score;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date create;
	
	public Admin() {
		super();
	}

	public Admin(int id, String name, double score, Date create) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.create = create;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", score=" + score + ", create=" + create + "]";
	}
	
	
}
