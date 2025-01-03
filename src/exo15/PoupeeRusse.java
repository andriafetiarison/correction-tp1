package exo15;

public class PoupeeRusse {
	private int taille;
	private boolean ouverte;
	private PoupeeRusse dans, contient;
	 
	public PoupeeRusse (int taille) {
		this.taille = taille;
		this.ouverte = false;
	}
	 
	public void ouvrir() {
		if(!this.ouverte && this.dans==null) 
			this.ouverte = true;
	}
	 
	public void fermer() {
		if(this.ouverte && this.dans == null) 
			this.ouverte = false;
	}
	
	public void placerDans(PoupeeRusse p) {
		if(!this.ouverte && this.dans == null && p.ouverte && p.contient == null && p.taille> this.taille) {
			this.dans = p;
			p.contient = this;
		}
	}
	 
	public void sortirDe(PoupeeRusse p) {
		if(p.ouverte && p.contient == this) {
			this.dans = null;
			p.contient = null;
		}
	}
}
