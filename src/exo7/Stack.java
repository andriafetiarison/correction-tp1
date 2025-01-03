package exo7;

public class Stack {
	private int[] content;
	private int nbr;
	
	public Stack(int capacite) {
		if(capacite <= 0) {
			throw new IllegalArgumentException("La capacité doit être supérieure à 0");
		}
		this.content = new int[capacite];
		this.nbr = 0;
	}
	
	public boolean empty() {
		return nbr == 0;
	}
	
	public void push(int valeur) {
		if (nbr == content.length) {
            int[] newContent = new int[content.length * 2];
            System.arraycopy(content, 0, newContent, 0, content.length);
            content = newContent;
        }
        content[nbr++] = valeur;
	}
	
	 public int pop() {
        if (empty()) {
            throw new IllegalStateException("La pile est vide, impossible de retirer un élément.");
        }
        return content[--nbr];
     }
	 
	 @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < nbr; i++) {
            sb.append(content[i]);
            if (i < nbr - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
