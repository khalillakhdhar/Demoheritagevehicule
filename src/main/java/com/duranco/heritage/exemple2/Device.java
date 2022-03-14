package com.duranco.heritage.exemple2;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "categorie")
public class Device {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = true)
private String deviceName;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getDeviceName() {
	return deviceName;
}
public void setDeviceName(String deviceName) {
	this.deviceName = deviceName;
}


}
