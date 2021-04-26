package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		Random random = new Random();
		int max=100;
		int min=1;
		boolean bool=true;
		Scanner scanner = new Scanner(System.in) ;
		int i = scanner.nextInt() ;
		int value = random.nextInt(max - min) + min;
		int nbcoups = 1; 
		
		System.out.println("ecrire un nombre entre 1 et 100");
		
		  while(i != value){
			  if (i<value) {
				  System.out.println("trop bas");
				  nbcoups++;
			  }
			  else {
				  System.out.println("trop hautes");
				  nbcoups++;
			  }
			  i =  scanner.nextInt() ;

	}
		  System.out.println("Bravo tu es un champion comme Remis !! ton nombre de coups est egal a "+ nbcoups);
	}
}
