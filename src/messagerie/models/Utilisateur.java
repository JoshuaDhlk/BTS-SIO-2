package messagerie.models;

public class Utilisateur {
	private String nom;
	private int age;
	private String prenom;
	private String dateAnniversaire;

	
	//Constructeur
	public Utilisateur(String nom, int age, String prenom) {
		this.nom = nom;
		this.age = age;
		this.prenom = prenom;
		this.dateAnniversaire = dateAnniversaire;
	}
	
	public Utilisateur(String nom, String prenom) {
		this(nom, 0, prenom);
	}
	
	public Utilisateur() {
		this("?",0, "?");
	}
	//pour afficher Maurice avec methode afficher
	public void afficher() {
		System.out.println(nom + "...");
	}
	
	//pour afficher Maurice avec methode Override
	@Override
	public String toString() {
		return nom + " " + prenom + " (" + age + ")";
	}

	/*----------------------
	//Accesseur /Mutateur
	----------------------*/
	
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	public int getAge() {
		return this.age;
	}
	
	public String getDateAnniversaire() {
		return this.dateAnniversaire;
	}
	public void setDateAnniversaire(String dateAnniversaire) {
		this.dateAnniversaire=dateAnniversaire;
		
	// Ne respect pas les norme du Set
	
	public boolean setAge(int age) {
		if(age >= 0 && age <= 130) {
			this.age=age;
			return true;
		}else {
			return false;
		}
	}
}


