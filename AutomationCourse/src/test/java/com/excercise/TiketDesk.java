package com.excercise;

public class TiketDesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioCoolPark = 9.99;
		double precioTesterPark = 4.99;
		int age = 25;
		boolean student = true;

		/*
		 * CoolParkTicket coolPark = new CoolParkTicket(precioCoolPark, age, student);
		 * coolPark.printPriceDay("xyz", "Dia del niño"); coolPark.getTicketPrice();
		 * 
		 * TesterParkTicket testerPark = new TesterParkTicket(precioTesterPark, age,
		 * student); testerPark.printPriceDay("abc", "Navidad");
		 * testerPark.getTicketPrice();
		 */

		TicketsPark ticket = new CoolParkTicket(precioCoolPark, age, student);
		ticket.printPriceDay();
		ticket.getTicketPrice();

		ticket = new TesterParkTicket(precioTesterPark, age, student);
		ticket.printPriceDay();
		ticket.getTicketPrice();

	}
}
