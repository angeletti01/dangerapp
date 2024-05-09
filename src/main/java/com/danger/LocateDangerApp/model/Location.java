package com.danger.LocateDangerApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location", schema="location")
public class Location {

	@Id
	@Column(name = "location_id")
	@GeneratedValue(generator = "location_locationId_seq", strategy = GenerationType.AUTO)
	private Integer locationId;
	
	@Column(name = "longitude")
	private Double longitude;
	
	@Column(name = "latitude")
	private Double latitude;
	
	@Column(name= "description")
	private String description;
	
	@Column(name = "messenger_name")
	private String messengerName;
}
