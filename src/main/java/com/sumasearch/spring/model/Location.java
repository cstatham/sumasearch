package com.sumasearch.spring.model;

import javax.persistence.*;

@Entity
@Table(name="location")
public class Location {

	@Id
	@Column(name = "id", columnDefinition = "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	private String area;

	private String Zone;

	private String region;

	public int getId() {
		return id;
	}

	public void setId(int newId) {
		id = newId;
	}

	public String getName() {
        	return name;
    	}
 
    	public void setName(String name) {
        	this.name = name;
    	}
}

