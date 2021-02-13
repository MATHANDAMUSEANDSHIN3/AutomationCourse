package com.excercise;

public abstract class TicketsPark {

	String welcomeMessage;

	public TicketsPark() {
		this.welcomeMessage = "Welcome Cooltesters Park ";
	}

	public String welcomeMessageString() {
		return this.welcomeMessage;
	}

	// Abstraction

	public abstract double getTicketPrice();
	public abstract void printPriceDay();
	public abstract void printPriceDay(String keymanager, String priceDay);
}
