package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		 int[] copiedArray = array.clone();
		 
		 for ( int i= copiedArray.length -1; i>=0; i-- ) {
	            System.out.println( copiedArray[ i ] );
	            	        } 
	            for ( int d=0; d<array.length; d++ ) {
		            System.out.println( array[ d ] );
	      
	}
	}
}
