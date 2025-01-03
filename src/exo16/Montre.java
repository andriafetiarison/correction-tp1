package exo16;

public class Montre {
	int heure, min;
	Personne p;
	 
	Montre(int h, int m){
		this.heure = h;
		this.min = m;
	}
	
	public Montre(Montre m){
		this.heure = m.heure;
		this.min = m.min;
	}
		 
	public void avance(){
		if(this.min==59){
			if(this.heure == 23) this.heure = 0;
			else this.heure = this.heure++;
		 this.min = 0;
		}
		 
		else this.min++;
	}
		 
	public static void main(String[] toto){
		Montre m = new Montre(13,45);
		Montre n = new Montre(m);
	}
}
