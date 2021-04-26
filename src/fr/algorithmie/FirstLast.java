package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		 int[] tab = {6,1,3,6};
	        boolean bool = true;

	        for (int i = 0; i< tab.length-1; i++) {
	            if((tab.length>1) && (tab[0]==tab[tab.length-1]))  {
	                bool = true;
	            }
	            else {
	                bool=false;
	            }
	        }

	        System.out.println(bool);

	}

}
