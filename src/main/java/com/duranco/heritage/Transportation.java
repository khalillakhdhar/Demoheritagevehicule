package com.duranco.heritage;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Transportation extends Vehicule {
private int loadCapacity;

public int getLoadCapacity() {
	return loadCapacity;
}

public void setLoadCapacity(int loadCapacity) {
	this.loadCapacity = loadCapacity;
}




}
