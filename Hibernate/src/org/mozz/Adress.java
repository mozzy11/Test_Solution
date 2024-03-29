package org.mozz;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	@Column(name="STREET_NAME")// Changes the name of the column in the database
	private String street;
	
	@Column(name="CITY_NAME")
	private String city;
	
	@Column(name="CITY_NAME")
	private String state;
	
	@Column(name="PIN_CODE")
	private String pincode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
	
}
