package com.duranco.heritage;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Passenger extends Vehicule {
private int passengers;

public int getPassengers() {
	return passengers;
}

public void setPassengers(int passengers) {
	this.passengers = passengers;
}



}
