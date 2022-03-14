package com.duranco.heritage;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public class Vehicule {
@Id
private long id;
private String manifacturer;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getManifacturer() {
	return manifacturer;
}
public void setManifacturer(String manifacturer) {
	this.manifacturer = manifacturer;
}






}
