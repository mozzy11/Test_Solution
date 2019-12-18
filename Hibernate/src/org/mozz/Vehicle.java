package org.mozz;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
    @Id @GeneratedValue
	private int VehicleId;
	private String VehicleName;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private userDetails user;//creating a reverse relationship
	
	
	public userDetails getUser() {
		return user;
	}
	public void setUser(userDetails user) {
		this.user = user;
	}
	public int getVehicleId() {
		return VehicleId;
	}
	public void setVehicleId(int vehicleId) {
		VehicleId = vehicleId;
	}
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	
	
}
