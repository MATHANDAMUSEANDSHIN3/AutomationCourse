package com.excercise;

public class TesterParkTicket extends TicketsPark {

	double adultTicket, childTicket, studentTicket;
	int age;
	boolean student = false;
	String priceDay, park;

	// Constructor
	public TesterParkTicket(double price, int personAge, boolean studentID) {
		super();
		adultTicket = price;
		childTicket = price * (.60);
		studentTicket = price * (.30);
		age = personAge;
		student = studentID;
		priceDay = "Normal Day Price";
		park = "Tester Park ";
	}

	// Encapsulation
	// Setter
	private void setPriceDay(String priceDay) {
		this.priceDay = priceDay;
	}

	// Getter
	private String getPriceDay(String priceDay) {
		return priceDay;
	}

	// METHOD
	@Override
	public double getTicketPrice() {
		double priceTicket;
		if (student == true) {
			priceTicket = studentTicket;
			System.out.println("Student Price (60% applied): $" + studentTicket);
		} else if (age >= 18) {
			priceTicket = adultTicket;
			System.out.println("Adult Price: $" + adultTicket);
		} else {
			priceTicket = childTicket;
			System.out.println("Child Price (30% applied): $" + childTicket);
		}
		return priceTicket;
	}

	// Overloading
	@Override
	public void printPriceDay() {
		System.out.println(welcomeMessageString() + park + getPriceDay(priceDay));
	}

	@Override
	public void printPriceDay(String keyManager, String priceDay) {
		setPriceDay(priceDay);
		System.out.println(welcomeMessageString() + park + getPriceDay(priceDay));
	}
}
