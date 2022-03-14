package com.duranco.heritage;

import javax.persistence.Entity;

@Entity
public class Car extends Passenger {
private int noofdoors;

public int getNoofdoors() {
	return noofdoors;
}

public void setNoofdoors(int noofdoors) {
	this.noofdoors = noofdoors;
}






}
