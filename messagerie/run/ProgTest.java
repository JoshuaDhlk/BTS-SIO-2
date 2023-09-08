package messagerie.run;

import messagerie.models.Utilisateur;
import messagerie.techics.Password;
import messagerie.techics.SpeCharRule;
import messagerie.techics.MinCharRule;
import messagerie.techics.SpeCharRuleRegexp;

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
		
		Password motDePasse = new Password("azerty");
		motDePasse.addRule(new MinCharRule(8));
		motDePasse.addRule(new SpeCharRule(1));
		System.out.println(motDePasse.isValid());
	}

	
}
