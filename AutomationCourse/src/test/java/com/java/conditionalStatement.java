package com.java;

public class conditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Detector de velocidad (IF ELSE)

		int v = 80;
		int vmax = 80;

		if (v > vmax) {
			System.out.println("El coche va a exceso de velocidad");
		} else {
			System.out.println("El coche está dentro del rango permitido");
		}

		// (IF ANIDADO)

		int v2 = 110;
		boolean carretera = true;

		if (carretera) {
			System.out.println("Eestas en una carretera");
			if (v2 > vmax) {
				System.out.println("El coche va a exceso de velocidad");
			} else {
				System.out.println("El coche está dentro del rango permitido");
			}

		}

// Temperatura Switch Case, usado para valores fijos

		int mode = 10;

		switch (mode) {

		case 5:
			System.out.println("Congelado");
			break;

		case 10:
			System.out.println("Frio");
			break;

		case 20:
			System.out.println("Templado");
			break;

		case 30:
			System.out.println("Caliente");
			break;

		default:
			System.out.println("No encontró relacion con la temperatura");
			break;
		}
	}
}