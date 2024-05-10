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
	
	@Column(name = "reporterName")
	private String reporterName;

	public Location(Integer locationId, Double longitude, Double latitude, String description, String reporterName) {
		super();
		this.locationId = locationId;
		this.longitude = longitude;
		this.latitude = latitude;
		this.description = description;
		this.reporterName = reporterName;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReporterName() {
		return reporterName;
	}

	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((locationId == null) ? 0 : locationId.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((reporterName == null) ? 0 : reporterName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (locationId == null) {
			if (other.locationId != null)
				return false;
		} else if (!locationId.equals(other.locationId))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (reporterName == null) {
			if (other.reporterName != null)
				return false;
		} else if (!reporterName.equals(other.reporterName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", description=" + description + ", reporterName=" + reporterName + "]";
	}	
	
	
}
