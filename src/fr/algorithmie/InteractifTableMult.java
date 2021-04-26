package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int i = scanner.nextInt() ;
		boolean bool = false;
		 do {
			if(i>=1 && i<=10) {
			
			for(int b = 0; b <= 10; b++) {
			int mult = i * b;
			System.out.println("table de multiple " + i +("x")+ b+("=")+ mult);
			}
			
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
