package exo9;

public class Pokemon {
	private String nom;
	private int hp;
	private int atk;
	
	public Pokemon(String nom, int hp, int atk) {
		this.nom = nom;
		this.hp = hp;
		this.atk = atk;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public boolean isDead() {
		if(hp ==0) {
			System.out.println("Le Pokemon est mort.");
			return false;
		}
		else {
			System.out.println("Le Pokemon est encore en vie.");
			return true;
		}
	}
	
	public void attaquer(Pokemon p) {
		int damage = this.atk;
        p.hp = Math.max(0, p.hp - damage);
	}
	
	@Override
	public String toString() {
		return String.format("%s (HP: %d, ATK: %d)", this.nom, this.hp, this.atk);
	}
}
