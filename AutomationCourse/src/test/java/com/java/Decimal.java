package com.java;

/*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

EXAMPLES OF INPUT/OUTPUT:
* areEqualByThreeDecimalPlaces(-3.1756, -3.175); ? should return true since numbers are equal up to 3 decimal places.
* areEqualByThreeDecimalPlaces(3.175, 3.176); ? should return false since numbers are not equal up to 3 decimal places
* areEqualByThreeDecimalPlaces(3.0, 3.0); ? should return true since numbers are equal up to 3 decimal places.
* areEqualByThreeDecimalPlaces(-3.123, 3.123); ? should return false since numbers are not equal up to 3 decimal places.

TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.*/

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean areEqualByThreeDecimalPlaces = areEqualByThreeDecimalPlaces(3.141, 3.1401);
		System.out.println("¿El número es igual por tres decimales? " + areEqualByThreeDecimalPlaces);
	}

	public static boolean areEqualByThreeDecimalPlaces(double da, double db) {

		int ia = (int) da;
		int ib = (int) db;

		if (ia * 1000 == ib * 1000) {
			return true;
		} else
			return false;

	}
}
