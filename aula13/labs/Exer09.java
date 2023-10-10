package com.abade.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Farenheit: ");
		double farenheit = scan.nextDouble();
		
		double celsius = (5 * (farenheit - 32) / 9);
		
		System.out.println("A temperatura " + farenheit + " Farenheit é igual a " + celsius + " Celsius");

	}

}
