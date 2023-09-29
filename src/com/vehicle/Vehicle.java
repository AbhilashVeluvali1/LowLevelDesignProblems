package com.vehicle;

import com.common.ParkingTicket;

public abstract class Vehicle extends ParkingTicket {
	public abstract void assignTicket();
	public abstract String licenseNo();
}
