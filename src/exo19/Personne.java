package exo19;

public class Personne {
	
	protected String nom;
	protected String prenom;
	protected int compteBancaire;
	
	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
		this.compteBancaire = 0;
	}
	
	public void addSous(int montant) {
		this.compteBancaire = this.compteBancaire + montant;
	}
}
