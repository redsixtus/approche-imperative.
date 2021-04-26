package fr.algorithmie;


public class AffichageInverse {

	public static void main(String[] args) {
		
		int[] myarray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		System.out.println( "affichage1" );
		 for ( int i=0; i<myarray.length; i++ ) {
	            System.out.println( myarray[ i ] );
	            
	        }
	
		 int[] myArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 System.out.println( "affichage" );
		 for ( int i= myArray.length -1; i>=0; i-- ) {
	            System.out.println( myArray[ i ] );
		 }
		 
		 int[] Array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 System.out.println( "affichage3" );
		 int[] copiedArray = Array.clone();
		 for ( int i=0; i<copiedArray.length; i++ ) {
	            System.out.println( copiedArray[ i ] );
	        }
	}
	
}
