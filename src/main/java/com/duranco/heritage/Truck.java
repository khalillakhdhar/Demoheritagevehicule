package com.duranco.heritage;

import javax.persistence.Entity;

@Entity
public class Truck extends Transportation {
	private int noofcontainers;

	public int getNoofcontainers() {
		return noofcontainers;
	}

	public void setNoofcontainers(int noofcontainers) {
		this.noofcontainers = noofcontainers;
	}
	
	
	
	

}
