package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
		for (int i = 1; i<=10; i++ ) {
			System.out.println(i);
		}
		// Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
		for(int i = 0; i<=10; i++)
			if (i % 2 == 0) {
			      System.out.println(i);
			    }
		// Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
		for(int i = 0; i<=10; i++)
			if (i % 2 != 0) {
			      System.out.println(i);
			    }
		// Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
		int w = 0;
		while (w<10) {
			w++;
			System.out.println(w);
		}
		// Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
		int wi = 0;
		while (wi<=10) {
			
			if (wi % 2 == 0) {
			      System.out.println(wi);
			    }
			wi++;
	}
		// Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
		int win = 0;
		while (win<=10) {
			
			if (win % 2 != 0) {
			      System.out.println(win);
			    }
			win++;
	}

}
}