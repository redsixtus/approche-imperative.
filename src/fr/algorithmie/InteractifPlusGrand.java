package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		int[] array = new int [11];
		int valeurMax= 0;
		for(int i = 0;i<array.length; i++) {
		Scanner scanner = new Scanner(System.in) ;
		int n = scanner.nextInt() ;
		array[i] = n;
		if(array[i] > valeurMax) {
            valeurMax=array[i];
            
            
            
            }
		}
		System.out.println(  "le Max est "+ valeurMax );
		
	}

}
