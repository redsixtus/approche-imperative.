package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int i = scanner.nextInt() ;
		boolean bool = false;
		 do {
			if(i>=1 && i<=10) {
			System.out.println("c'est le juste prix");
			
			bool = true;
			
			}
			else{
			System.out.println("c'est pas le juste prix");
			bool = false;
			i = scanner.nextInt() ;
			}
		}while(!bool);
	}

}
