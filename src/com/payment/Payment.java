package com.payment;

import java.util.Date;

public abstract class Payment {
	double amount;
	Status status;
	Date timeStamp;
	Double calculate() {
		return 0.0;
	}

}
