package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2= {-1, 12, 17, 14, 5, -9, 0, 18}; 
		int[] array3= new int[array.length];
		
		for ( int i = 0 ; i< array.length; i++ ) {
	    if(i>array2.length-1) {
	    	  array3[i]= array[i];}
	    else {     
		array3[i]=(array[i]+array2[i]);
	    }
		System.out.println(  "la Sommes des tableaux est "+ array3[i] );	
		}
	   
	}
}
