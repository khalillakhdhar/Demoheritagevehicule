package com.duranco.heritage.exemple2;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Ecran extends Sortie {
	@NotNull
	private String qualite;

	public String getQualite() {
		return qualite;
	}

	public void setQualite(String qualite) {
		this.qualite = qualite;
	}
	
	
	
	
	

}
