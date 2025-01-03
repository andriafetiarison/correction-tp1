package exo17;

public class IngredientADecouper extends Ingredient {
	
	public IngredientADecouper(String n, String e, int q, String unite){
		super(n,e,q,unite);
	}
		 
	public void decouper(){
		this.etat = "decoupe";
	}
}
