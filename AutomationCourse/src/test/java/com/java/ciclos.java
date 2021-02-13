package com.java;

public class ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While

		int n = 0;

		while (n <= 10) {
			System.out.println("El numero es " + n);
			++n;
		}

		// Do While
		int nl = 1;
		int sumtotal = 0;
		int count = 0;

		do {
			sumtotal += nl;
			++count;
		} while (sumtotal < 100);
		System.out.println("El número se sumó " + count);
	
		
		//For 
		
		int nfor=0;
		
		for(int i =10; i<nfor; i++) {
			System.out.println("El numero for es " + i);
		}
	
	}
	}

	
