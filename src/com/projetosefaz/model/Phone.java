package com.projetosefaz.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {

	private int id;
	private int ddd;
	private String number;
	private String type;
		
	public Phone() {
		
	}

	public Phone(int ddd, String number, String type) {
		super();
		this.ddd = ddd;
		this.number = number;
		this.type = type;
	}
	
	public Phone(int id, int ddd, String number, String type) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.number = number;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
