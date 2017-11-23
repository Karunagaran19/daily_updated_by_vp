package com.veh;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("two")
public class TwoWheeler extends Vehicle {
	private String streeingHandle;

	public String getStreeingHandle() {
		return streeingHandle;
	}

	public void setStreeingHandle(String streeingHandle) {
		this.streeingHandle = streeingHandle;
	}

	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

}
