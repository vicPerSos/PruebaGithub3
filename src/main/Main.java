package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("");
		String cadena = sc.next();
		String letra;
		for (int i = 0;i<cadena.length()-1;i++) {
			letra = cadena.substring(i, i+1);
			System.out.println(letra);
		}
		
	}

}