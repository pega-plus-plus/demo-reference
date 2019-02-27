package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {
	
	public Category() {
		super();
	}
	public Category(String name) {
		super();
		this.name = name;
	}
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Id //indicates a primary key
	@GeneratedValue(strategy= GenerationType.AUTO, generator="categorySeq")
	@SequenceGenerator(allocationSize=1, name="categorySeq", sequenceName="SQ_CATEGORY_PK")
	@Column(name="CATEGORY_ID")
	private int id;
	@Column(name="CATEGORY_NAME")
	private String name;
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
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

}
