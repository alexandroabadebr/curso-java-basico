package com.abade.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Entre com o valor/hora");
			double valorHora = scan.nextDouble();
			
			System.out.println("Emtre com a quantidade de horas tabalhadas ao mês");
			double horas = scan.nextDouble();
			
			double salario = valorHora * horas;
			
			System.out.println("O salário é de: " + salario);

	}

}
