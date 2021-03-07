package com.konumAlgilama.konumAlgilama.Entities;

import javax.persistence.*;

@Entity
@Table(name="city")
public class City {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="city_no")
	private int city_no;

	public City () {}
	
	public City(int id, String name, int city_no) {
		this.id = id;
		this.name = name;
		this.city_no = city_no;
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

	public int getCity_no() {
		return city_no;
	}

	public void setCity_no(int city_no) {
		this.city_no = city_no;
	}
}