package messagerie.run;

import messagerie.models.Utilisateur;

public class ProgTest {

	public static void main(String[] args) {
		
		Utilisateur u = new Utilisateur("Jack", 57, "Bébert");
		u.afficher();
		System.out.println(u);
		
		Utilisateur u2 = new Utilisateur("Jean", "Clenche");
		System.out.println(u2);
		
		u2.setAge(30);
		System.out.println(u);
		
		if (u2.setAge(120)) {
			System.out.println(u2);
		}else {
			System.out.println("Erreur de saisie de l'age");
		}
	}

}
