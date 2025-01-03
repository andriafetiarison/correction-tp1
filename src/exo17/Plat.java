package exo17;

import java.util.ArrayList;

public class Plat {
	private String nom;
	ArrayList<Ingredient> ingredients;
	
	public Plat(String nom){
		this.nom = nom;
		this.ingredients = new ArrayList<Ingredient>();
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public ArrayList<Ingredient> getIngredients(){
		return this.ingredients;
	}
	
	public void addIngredient(Ingredient i){
		 this.ingredients.add(i);
	}
		 
	public boolean equals(Object o){
		 if(o instanceof Plat){
			 for(Ingredient i:this.ingredients){
				 if(!((Plat) o).ingredients.contains(i)) return false;
			 }
			 return this.ingredients.size() == ((Plat) o).ingredients.size();
		 }
		 else return false;
	}
	
	public static void main(String[] toto){
		 Plat p = new Plat("Choucroute");
		 p.addIngredient(new Ingredient("choucroute","cuite",500,"g"));
		 p.addIngredient(new Ingredient("lard","cuit_entier",150,"g"));
		 p.addIngredient(new Ingredient("saucisse","cuite_entiere",2,"cardinalite")); 
	}
}
