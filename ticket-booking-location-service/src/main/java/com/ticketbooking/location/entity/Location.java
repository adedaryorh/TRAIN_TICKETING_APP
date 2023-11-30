package com.ticketbooking.location.entity;

import javax.persistence.*;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "app_location")
public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "app_location_SEQ")
	@SequenceGenerator(name = "app_location_SEQ", sequenceName = "app_location_SEQ", allocationSize = 1)
	private int id;
	
	@NonNull
    private String name;
    
	@NonNull
    private String description;
	
    private int status;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
    	
}
