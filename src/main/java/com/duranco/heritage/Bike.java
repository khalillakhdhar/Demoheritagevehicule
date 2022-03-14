package com.duranco.heritage;

import javax.persistence.Entity;

@Entity
public class Bike extends Passenger {
int saddleHeight;

public int getSaddleHeight() {
	return saddleHeight;
}

public void setSaddleHeight(int saddleHeight) {
	this.saddleHeight = saddleHeight;
}




}
