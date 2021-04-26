package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		float valeurAd = 0F;
		int sommeIndex=array.length;
		float moyenne= 0F;
		
		for ( int i = 0 ; i<=array.length-1; i++ ) {
			
			valeurAd = valeurAd + array[i] ;
			    
	}
		moyenne = (valeurAd / sommeIndex );
System.out.println(  "votre Moyenne "+ moyenne );
}

}
