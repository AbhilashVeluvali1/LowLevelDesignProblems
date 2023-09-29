package com.parkingLot;

import com.common.Address;
import com.common.Entrance;
import com.common.ParkingTicket;

public class ParkingLot{
	private int id;
	private String name;
	Address address;
	public boolean addEntrance() {
		return true;
	}
	public boolean addExit() {
		return true;
	}
	public ParkingTicket getParkingTicket() {
		return null;
	}
	public boolean isFull() {
		return false;
	}
}
