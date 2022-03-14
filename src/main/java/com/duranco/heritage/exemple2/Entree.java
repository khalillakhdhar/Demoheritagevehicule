package com.duranco.heritage.exemple2;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public class Entree extends Device {
@NotNull
private int capacite;

public int getCapacite() {
	return capacite;
}

public void setCapacite(int capacite) {
	this.capacite = capacite;
}

}
