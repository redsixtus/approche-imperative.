package fr.algorithmie;

import java.util.Scanner;



public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int i = scanner.nextInt() ;
		for(int b = 1 ;b<=10; b++ ) {
			int som = i + b;
		System.out.println(som);
		}

	}

}
