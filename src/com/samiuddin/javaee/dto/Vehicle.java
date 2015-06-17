package com.samiuddin.javaee.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
//The below value is for not merging all derived classes with base class  
@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
/*  @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="VEHICLE_TYPE",
		discriminatorType=DiscriminatorType.STRING
)*/
public class Vehicle {
	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;
	/*@ManyToOne
	@JoinColumn(name="USER_ID")
	private UserDetails user;*/
//	@ManyToMany (mappedBy="vehicle")
	/*@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	private UserDetails user;*/
	/*private Collection <UserDetails> userList = new ArrayList(); 
			
	public Collection<UserDetails> getUserList() {
		return userList;
	}
	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
	}*/
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
}
