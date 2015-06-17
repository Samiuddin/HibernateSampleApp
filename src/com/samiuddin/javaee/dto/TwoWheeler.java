/**
 * 
 */
package com.samiuddin.javaee.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author sami
 *
 */
@Entity
//@DiscriminatorValue("Bike")
public class TwoWheeler extends Vehicle {
	private String SteeringHandle;

	public String getSteeringHandle() {
		return SteeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		SteeringHandle = steeringHandle;
	}
}
