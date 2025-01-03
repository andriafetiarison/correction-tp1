package exo17;

public class Ingredient {
	protected String nom_aliment;
	protected String etat;
	protected int quantite;
	protected String unite;
	
	public Ingredient(String nom_aliment, String etat, int quantite, String unite){
		this.nom_aliment = nom_aliment;
		this.etat = etat;
		this.quantite = quantite;
		this.unite = unite;
	}
	
	public boolean equals(Object o){
		 return (o instanceof Ingredient) && 
		 this.nom_aliment.equals(((Ingredient) o).nom_aliment) &&
		 this.etat.equals(((Ingredient) o).etat);
	}
}
