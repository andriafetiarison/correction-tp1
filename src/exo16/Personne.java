package exo16;

public class Personne {
	protected String nom;
	protected Montre m;
	 
	public Personne(String nom){
		this.nom = nom;
		this.m = null;
	}
	 
	public boolean porteMontre(Montre m){
		if(m.p != null && this.m == null){
			this.m = m;
			m.p = this;
			return true;
		}
		else return false; 
	}
	
	public Montre enleveMontre(){
		Montre m = this.m;
		this.m = null;
		
		if(m != null) m.p = null;
			return m;
	}
	 
	public String donneHeure(){
		if(this.m != null) return this.m.heure + "h" + this.m.min;
		else return "";
	}
}
