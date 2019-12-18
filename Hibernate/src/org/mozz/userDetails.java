package org.mozz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.cfg.Configuration;
//import org.hibernate.annotations.CollectionId;

//  @Entity comands hibernate to treat this class as an entity

 @Entity(name = "USER_DETAILS_2")
public class userDetails {
	
	@Id @GeneratedValue // this automatically make an increment to the user id whenever a new object instance is saved to the database
	private int UserId;

	@OneToMany(mappedBy="user")// "mapped by"  maps the two tables/entities without creating a sepatae table for the joincolumns/ids
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	@Column (name = "USER_NAME")
	private String Username;
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	
	

}
