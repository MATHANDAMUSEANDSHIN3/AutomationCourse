package com.java;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arreglo unidimensional
		
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Ssabado", "Domingo"};
		System.out.println(dias[3]);
		String diafavorito =dias[2];
		System.out.println("Mi dia favorito es " +diafavorito);
		
		//EJEMPLO CON FOR
		
		for(int i=0; i<7; i++) {
			System.out.println(dias[i]);
		}
	

	
	//Arreglo bidimensional
	
	String[][]amigo = new String[2][2];
	
	amigo[0][0]="Amigo1";
	amigo[0][1]="Amigo2";
	amigo[1][0]="Amigo3";
	amigo[1][1]="Amigo4";
	System.out.println("Mi amigo favorito es "+amigo[1][1]);
	
	
	
}
}