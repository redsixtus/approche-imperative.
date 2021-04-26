package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
        int[] tab = {6,1,3,5};
        boolean bool = true;

        for (int i = 0; i< tab.length-1; i++) {
            if((tab.length>1) && (tab[0]==6) || (tab[tab.length-1]==6)) {
                bool = true;
            }
            else {
                bool=false;
            }
        }

        System.out.println(bool);

	}

}
