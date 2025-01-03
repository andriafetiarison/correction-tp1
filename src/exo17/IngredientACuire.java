package exo17;

public class IngredientACuire extends Ingredient {
	public int temperature;
	
	public IngredientACuire(String n, String e, int q, String unite, int t){
		super(n,e,q,unite);
		this.temperature = t;
	}
	
	public void cuire(){
		this.etat = "cuit";
	}
}
