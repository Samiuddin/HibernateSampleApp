/**
 * 
 */
package com.samiuddin.javaee.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author sami
 *
 */
//@Entity (name="USER_DETAILS")
@Entity
@Cacheable
@Cache (usage=CacheConcurrencyStrategy.READ_ONLY)
@NamedNativeQuery (name="UserDetails.byName", query=" select * from userdetails where username= ?", resultClass=UserDetails.class)
//@NamedQuery (name="UserDetails.byId", query=" from UserDetails where userID = ? ")
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
//@Table (name="USER_DETAILS")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)// use @EmbeddedId for objects that can act as primary key
	private int userID;//becomes primary key
	//@Transient
	private String userName;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	//@Column (name="USER_NAME")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/*@OneToOne
	//@OneToMany (mappedBy="user")
	//@JoinColumn(name="VEHICLE_ID")
	//private Vehicle vehicle;
	@JoinTable (name="USER_VEHICLE", joinColumns=@JoinColumn(name="USER_ID"), 
						  inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
	@ManyToMany
	@OneToMany(cascade=CascadeType.PERSIST)
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>(); 
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
		@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="USER_ADDRESS", 
						joinColumns=@JoinColumn (name="USER_ID"))
	//@GenericGenerator (name="hilo-gen", strategy="hilo")
//	@CollectionId(columns = { @Column (name="ADDRESS_ID")}, generator = "hilo-gen", type = @Type(type="long"))
	private Collection<Address> listOfAddresses = new ArrayList<Address>();
	
	public Collection<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(Collection<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
	@Temporal(TemporalType.DATE)
	//private Date joinedDate;
	@Embedded 
	@AttributeOverrides ({
		//for multiple column name overrides
	@AttributeOverride (name="street", column=@Column(name="HOME_STREET_NAME")),
    @AttributeOverride (name="city", column=@Column(name="HOME_CITY_NAME")),
    @AttributeOverride (name="state", column=@Column(name="HOME_STATE_NAME")),
    @AttributeOverride (name="pincode", column=@Column(name="HOME_PIN_CODE"))
	})
	private Address homeAddress;
	@Embedded
	private Address officeAddress;
*/
	/*
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}*/
	/*
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//@Lob
	private String description;
	*/
	//@Id
	//@Column (name="USER_ID")


}
