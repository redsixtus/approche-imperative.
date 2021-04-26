package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int n = scanner.nextInt() ;
		int som = 0; 
		
		for(int i = 1; i <= n; i++) {
			
		 som = som + i;
		 
		
		}
		 System.out.println(som);
	}

}
