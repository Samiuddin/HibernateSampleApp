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
//@DiscriminatorValue("Car")
public class FourWheeler extends Vehicle {
	private String SteeringWheel;

	public String getSteeringWheel() {
		return SteeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}
}
